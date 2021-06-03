/**
 * 
 */
package com.javamastermind.provider.service;

import com.javamastermind.provider.domain.Pizza;

/**
 * @author lahiru_w
 */
public interface PizzaSenderService
{
    public String sendPizza(Pizza pizza, String topic);
}
