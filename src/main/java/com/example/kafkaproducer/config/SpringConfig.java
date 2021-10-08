package com.example.kafkaproducer.config;


import com.example.kafkaproducer.model.KafkaModel;
import com.fasterxml.jackson.databind.JsonSerializable;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;


import java.util.HashMap;
import java.util.Map;

@Configuration
public class SpringConfig {

    @Bean
    public ProducerFactory<String, KafkaModel> producerFactory() {
        Map<String, Object> config = new HashMap<>();

        config.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "192.168.0.51:29092");
        config.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        config.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializable.class);

        return new DefaultKafkaProducerFactory<>(config);
    }

    @Bean
    public KafkaTemplate<String, KafkaModel> kafkaTemplate() {
        return new KafkaTemplate<>(producerFactory());
    }
}
