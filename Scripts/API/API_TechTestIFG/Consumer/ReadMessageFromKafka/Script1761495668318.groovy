import kafka.KafkaUtils
import com.kms.katalon.core.util.KeywordUtil

String bootstrap = "localhost:9092"
String topic = "student-topic"
String groupId = "katalon-consumer"

List<String> messages = KafkaUtils.readMessages(topic, bootstrap, groupId)

if (messages.any { it.contains('"score":95') }) {
    KeywordUtil.markPassed("Message found in Kafka topic")
} else {
    KeywordUtil.markFailed("Message not found in Kafka topic")
}
