/**
 * 
 */
package com.javamastermind.provider.config;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

/**
 * @author lahiru_w
 */
@Configuration
public class KafkaServiceProviderConfig
{
    @Value("${kafka.bootstrap-servers}")
    private String bootrsapServers;

    @Bean
    public Map<String, Object> providerConfig()
    {
        Map<String, Object> props = new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, bootrsapServers);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        return props;
    }
    
    @Bean
    public ProducerFactory<String, String> producerFactory() {
      return new DefaultKafkaProducerFactory<>(providerConfig());
    }

    @Bean
    public KafkaTemplate<String, String> kafkaTemplate() {
      return new KafkaTemplate<>(producerFactory());
    }
}
