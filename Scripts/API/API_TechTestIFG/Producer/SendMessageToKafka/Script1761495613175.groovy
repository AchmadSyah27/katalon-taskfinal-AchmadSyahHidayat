import kafka.KafkaUtils

String bootstrap = "localhost:9092"
String topic = "student-topic"
String message = '{"id":1,"name":"Achmad Syah Hidayat","score":95}'

KafkaUtils.sendMessage(topic, message, bootstrap)
