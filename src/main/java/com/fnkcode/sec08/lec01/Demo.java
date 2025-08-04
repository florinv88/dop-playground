package com.fnkcode.sec08.lec01;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Demo {

    public static final ObjectMapper MAPPER = new ObjectMapper();

    public static void main(String[] args) throws JsonProcessingException {

        String savedAddressJson= """
                {
                    "id" : "123"
                }
                """;

        String addressDetailsJson= """
                {
                    "street" : "Strada Unirea Principatelor",
                    "number" : "25",
                    "zipcode" : "077080"
                }
                """;

        System.out.println(deserialize(savedAddressJson));
        System.out.println(deserialize(addressDetailsJson));
        System.out.println(deserialize("{}"));
    }

    public static Address deserialize(String json) throws JsonProcessingException {
        return MAPPER.readValue(json, Address.class);
    }
}
