package com.fnkcode.sec02.lec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class CashRewards extends Cash{

    private static final Logger log = LoggerFactory.getLogger(CashRewards.class);

    @Override
    public void process(int amount) {
        super.process(amount);
        log.info("cash rewards {}", amount/10);
    }
}
