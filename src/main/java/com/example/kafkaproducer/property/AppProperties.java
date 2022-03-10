package com.example.kafkaproducer.property;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author cropdata-ujwal
 * @package com.example.kafkaproducer.property
 * @date 23/10/21
 * @time 4:33 PM
 */
@Data
@Component
public class AppProperties
{
    @Value("${kafka.bootstrap.server.address}")
    private String serverAddress;
}
