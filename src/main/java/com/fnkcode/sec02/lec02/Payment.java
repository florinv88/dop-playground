package com.fnkcode.sec02.lec02;

public sealed interface Payment permits CreditCard{

    void process(int amount);
}
