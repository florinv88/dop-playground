package com.fnkcode.sec05.domain;

public record Address(
        String street,
        String city,
        String zipCode
) {
    //ignore validation for simplicty
}
