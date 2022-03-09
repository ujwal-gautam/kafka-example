package com.example.kafkaproducer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
public class KafkaModel {

    private int id;
    private String name;

    private String emailId;


}
