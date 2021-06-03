/**
 * 
 */
package com.javamastermind.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author lahiru_w
 *
 */
@Configuration
class KafkaTopicConfig {

  @Value(value = "${provider.queue}")  
  private String queueOne;    
    
  @Bean
  public NewTopic topic1() {
    return TopicBuilder.name(queueOne).build();
  }

  @Bean
  public NewTopic topic2() {
    return TopicBuilder.name("pizzaPending").build();
  }
  
}