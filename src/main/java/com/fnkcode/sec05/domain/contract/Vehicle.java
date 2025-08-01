package com.fnkcode.sec05.domain.contract;

public sealed interface Vehicle {

    String make();

    record Car(String make , int year) implements Vehicle {}

    record Motorcycle(String make , int engineCC) implements Vehicle {}
}
