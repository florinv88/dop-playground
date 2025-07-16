package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Lec01RecordBasicsDemo {

    private static final Logger log = LoggerFactory.getLogger(Lec01RecordBasicsDemo.class);

    record Person(String firstName,
                  String lastName) {
    }

    public static void main(String[] args) {

         var person1 = new Person("John", "Doe");
         var person2 = new Person("John", "Doe");
         var person3 = new Person("Marice", "Doe");

         log.info("firstName: {}", person1.firstName());
         log.info("lastName: {}", person1.lastName());
         log.info("toString: {}", person1);

         log.info("person1 == person2: {}", (person1 == person2 ));
         log.info("person1 equals person2: {}", person1.equals(person2));

         log.info("person1 hascode: {}", person1.hashCode());
         log.info("person2 hascode: {}", person2.hashCode());
         log.info("person3 hascode: {}", person3.hashCode());
    }
}
