package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Lec07NullableFields {

    private static final Logger log = LoggerFactory.getLogger(Lec07NullableFields.class);

    record Person(String firstName,
                  Optional<String> nickName) {

        //nonCC
        Person(String firstName){
            this(firstName, Optional.empty());
        }

        //nonCC
        Person(String firstName,String nickName){
            this(firstName, Optional.ofNullable(nickName));
        }

    }

    public static void main(String[] args) {

        var person = new Person("John", "Doe");

        log.info("{}", person);

    }
}
