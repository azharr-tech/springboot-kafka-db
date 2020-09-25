package com.learning.kafka.springbootkafkadb.controller;

import com.learning.kafka.springbootkafkadb.service.ProducerClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    public ProducerClass producer;

    @PostMapping(value = "/send")
    public String sendMessage(@RequestParam("message") String message){
        this.producer.sendMessage(message);
        return "Message send successfully";
    }

}
