/**
 * 
 */
package com.javamastermind.provider.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author lahiru_w
 */
@Component
public class KafkaMessageSender
{

    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaMessageSender(KafkaTemplate<String, String> kafkaTemplate)
    {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message, String topicName)
    {
        kafkaTemplate.send(topicName, message);
    }
}
