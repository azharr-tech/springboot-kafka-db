package com.learning.kafka.springbootkafkadb.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaConfig {
    @Value("${kafka.topic}")String topic;
    @Value("${kafka.partition}")int partition;
    @Value("${kafka.rep-factor}")short repFactor;

    @Bean
    public NewTopic topic(){
        return new NewTopic(topic, partition, repFactor);
    }
}
