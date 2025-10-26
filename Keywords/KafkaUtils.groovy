import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import org.apache.kafka.clients.consumer.*
import org.apache.kafka.clients.producer.*
import org.apache.kafka.common.serialization.StringDeserializer
import org.apache.kafka.common.serialization.StringSerializer

import internal.GlobalVariable

public class KafkaUtils {
	
		static void sendMessage(String topic, String message, String bootstrapServers) {
			Properties props = new Properties()
			props.put("bootstrap.servers", bootstrapServers)
			props.put("key.serializer", StringSerializer.getName())
			props.put("value.serializer", StringSerializer.getName())
	
			Producer<String, String> producer = new KafkaProducer<>(props)
			producer.send(new ProducerRecord<>(topic, message))
			producer.close()
			println "✅ Message sent to topic: ${topic}"
		}
	
		static List<String> readMessages(String topic, String bootstrapServers, String groupId, int timeoutMs = 5000) {
			Properties props = new Properties()
			props.put("bootstrap.servers", bootstrapServers)
			props.put("key.deserializer", StringDeserializer.getName())
			props.put("value.deserializer", StringDeserializer.getName())
			props.put("group.id", groupId)
			props.put("auto.offset.reset", "earliest")
	
			Consumer<String, String> consumer = new KafkaConsumer<>(props)
			consumer.subscribe(Collections.singletonList(topic))
	
			List<String> messages = []
			ConsumerRecords<String, String> records = consumer.poll(timeoutMs)
			for (ConsumerRecord<String, String> record : records) {
				println "📥 Received message: ${record.value()}"
				messages.add(record.value())
			}
	
			consumer.close()
			return messages
		}
	
}
