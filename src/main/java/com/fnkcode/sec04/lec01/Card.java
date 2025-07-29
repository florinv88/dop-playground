package com.fnkcode.sec04.lec01;

public record Card(String iban,String amount, String currency) implements Payment {
}
