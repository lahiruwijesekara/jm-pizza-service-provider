/**
 * 
 */
package com.javamastermind.provider.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.javamastermind.provider.domain.Pizza;
import com.javamastermind.provider.service.PizzaSenderService;
import com.javamastermind.provider.util.KafkaMessageSender;

/**
 * @author lahiru_w
 */
public class PizzaSenderServiceImpl implements PizzaSenderService
{

    private KafkaMessageSender kafkaMessageSender;

    @Autowired
    public PizzaSenderServiceImpl(KafkaMessageSender kafkaMessageSender)
    {
        this.kafkaMessageSender = kafkaMessageSender;
    }

    @Override
    public String sendPizza(Pizza pizza, String topic)
    {
        kafkaMessageSender.sendMessage(pizza.toString(), topic);

        return null;
    }
}
