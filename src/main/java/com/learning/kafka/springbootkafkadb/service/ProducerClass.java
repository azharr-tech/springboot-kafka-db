package com.learning.kafka.springbootkafkadb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class ProducerClass {

    private static final Logger log = LoggerFactory.getLogger(ProducerClass.class);
    @Value("${kafka.topic}")String topic;

    @Autowired
    private KafkaTemplate kafkaTemplate;


    public void sendMessage(String message) {
        log.info(String.format("********message produced --> %s",message));
        kafkaTemplate.send(topic, message);
    }
}
