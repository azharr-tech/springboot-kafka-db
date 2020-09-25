package com.learning.kafka.springbootkafkadb.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class ConsumerClass {

    private static final Logger log = LoggerFactory.getLogger(ConsumerClass.class);

    @KafkaListener(topics = "prod-topic")
    public void consume(String message){
        log.info(String.format("********message consumed --> %s",message));
    }

}
