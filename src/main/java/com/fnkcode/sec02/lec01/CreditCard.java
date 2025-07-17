package com.fnkcode.sec02.lec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CreditCard extends Payment {

    private static final Logger log = LoggerFactory.getLogger(CreditCard.class);

    @Override
    public void process(int amount) {
        log.info("Credit card processed {}", amount);
    }
}
