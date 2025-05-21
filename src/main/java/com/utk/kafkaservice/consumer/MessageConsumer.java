package com.utk.kafkaservice.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
public class MessageConsumer {

    private static final Logger LOGGER = Logger.getLogger(MessageConsumer.class.getName());

    @KafkaListener(topics = "my-topic", groupId = "utk-group-id")
    public void listen(String message) {
        LOGGER.log(Level.INFO, "Received message: " + message);
    }
}
