package com.fnkcode.sec08.lec03;

public sealed interface Address {

    record SavedAddress(String id) implements Address {
    }
    record AddressDetails(String street, String number, String zipcode) implements Address {
    }
}
