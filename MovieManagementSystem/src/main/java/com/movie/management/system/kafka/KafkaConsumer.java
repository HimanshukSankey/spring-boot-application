package com.movie.management.system.kafka;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaConsumer {

    @KafkaListener(topics = "movie-update-topic", groupId = "movie-group")
    public void listenMovieUpdateTopic(ConsumerRecord<String, String> record) {
        // Process the incoming message
        String message = record.value();
        System.out.println("Received message: " + message);
    }
}