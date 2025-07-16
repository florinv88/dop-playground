package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;

public class Lec04NonCanonicalConstructor {

    private static final Logger log = LoggerFactory.getLogger(Lec04NonCanonicalConstructor.class);

    record Task(String title,
                LocalDate createdAt){

        Task (String title){
            this(title,LocalDate.now()); //delegate to canonical constructor
        }
    }

    public static void main(String[] args) {

        var task = new Task("Learn AWS",LocalDate.now().plusDays(2));
        var task2 = new Task("GYM");

        log.info("{}", task);
        log.info("{}", task2);
    }
}
