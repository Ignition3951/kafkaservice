package com.utk.kafkaservice.producer;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

//     This class will contain methods to send messages to Kafka topics
//     You can use KafkaTemplate to send messages
//     For example:
     private final KafkaTemplate<String, String> kafkaTemplate;

     public MessageProducer(KafkaTemplate<String, String> kafkaTemplate) {
         this.kafkaTemplate = kafkaTemplate;
     }

     public void sendMessage(String topic, String message) {
         kafkaTemplate.send(topic, message);
     }
}
