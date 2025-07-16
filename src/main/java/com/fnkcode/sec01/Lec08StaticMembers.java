package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Lec08StaticMembers {

    private static final Logger log = LoggerFactory.getLogger(Lec08StaticMembers.class);

    record Price(double amount,
                 String currency){

        private static final String USD = "$";

        static Price usd(double amount){
            return new Price(amount, USD);
        }
    }

    public static void main(String[] args) {



    }
}
