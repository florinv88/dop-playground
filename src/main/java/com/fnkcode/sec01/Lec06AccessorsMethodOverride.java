package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

public class Lec06AccessorsMethodOverride {

    private static final Logger log = LoggerFactory.getLogger(Lec06AccessorsMethodOverride.class);

    record Person(String firstName,
                  String lastName) {

        //can be overridden without changing their method signature
        public String lastName() {
            return lastName.toUpperCase(); //just for demo , not really recommended
        }

        //we can always create methods
        public Optional<String> firstNameAsOptional() {
            return Optional.ofNullable(firstName);
        }
    }

    public static void main(String[] args) {

        var person = new Person("John", "Doe");

        log.info("{}", person);

    }
}
