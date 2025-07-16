package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec02CanonicalConstructor {

    private static final Logger log = LoggerFactory.getLogger(Lec02CanonicalConstructor.class);

    record Person(String firstName,
                  String lastName) {

        public Person(String firstName,String lastName){
            //not really a good practice because we have compact constructor for this type of behaviour
            this.firstName = firstName;
            this.lastName = lastName.toUpperCase();
        }

    }

    public static void main(String[] args) {

         var person = new Person("John", "Doe");
         log.info("{}", person);
    }
}
