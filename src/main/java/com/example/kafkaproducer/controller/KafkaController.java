package com.example.kafkaproducer.controller;

import com.example.kafkaproducer.model.KafkaModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, KafkaModel> kafkaTemplate;
    private static final String TOPIC = "ujwal";

    @GetMapping("/publish/{id}/{name}/{email}")
    public String post(@PathVariable("id") final int id, @PathVariable("name") String name, @PathVariable("email") String email){
        kafkaTemplate.send(TOPIC, new KafkaModel(id,name, email));

        return "Published successfully";
    }

    @PostMapping("/store")
    public String storeData(@RequestBody KafkaModel kafkaModel){
        kafkaTemplate.send(TOPIC, kafkaModel);
        return "Store data successfully";
    }
}
