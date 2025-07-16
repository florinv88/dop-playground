package com.fnkcode.sec01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Lec09RecordInterface {

    private static final Logger log = LoggerFactory.getLogger(Lec09RecordInterface.class);

    record EmailTemplate(String template) implements UnaryOperator<String> {

        @Override
        public String apply(String name) {
            return template.formatted(name);
        }
    }

    public static void main(String[] args) {

        var emailTemplate = new EmailTemplate("Hi %s. You are a boss today!");

        Stream.of("sam","mike","fnk")
                .map(emailTemplate)
                .forEach(log::info);

    }
}
