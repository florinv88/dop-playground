package com.fnkcode.sec02.lec02;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public record CreditCard(String number) implements Payment {

    //not a good practice since records must be data carriers --> just an teaching example
    private static final Logger log = LoggerFactory.getLogger(CreditCard.class);

    @Override
    public void process(int amount) {
        log.info("credit card processed with amount {}", amount);
    }
}
