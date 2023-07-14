/*
package com.zerobase.convpay.config;

import com.zerobase.convpay.service.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.HashSet;


@Configuration
public class ApplicationConfig {

    @Bean
    public ConveniencePayService conveniencePayService(){
        return new ConveniencePayService(
                new HashSet<>(
                        Arrays.asList(moneyAdapter(), cardAdapter())
                ),
                discountByConvenience()
        );
    }

    @Bean
    private static CardAdapter cardAdapter() {
        return new CardAdapter();
    }

    @Bean
    private static MoneyAdapter moneyAdapter() {
        return new MoneyAdapter();
    }

    @Bean
    public  DiscountByConvenience discountByConvenience() {
        return new DiscountByConvenience();
    }

    public ConveniencePayService conveniencePayServiceDiscountPayMethod(){
        return new ConveniencePayService(
                new HashSet<>(
                        Arrays.asList(new MoneyAdapter(), cardAdapter())
                ),
                new DiscountByPayMethod()
        );
    }
}
*/
