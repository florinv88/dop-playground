package com.fnkcode.sec04.lec01;

public class Lec01 {

    public static void main(String[] args) {
        getDetails(new Card("ROCBX3232","200","RON"));
    }

    //pattern matching
    public static void getDetails(Payment payment) {
        switch (payment) {
            case Cash cash -> System.out.println("cash "+ cash.amount());
            case Card(String iban,_,_) -> System.out.println("card iban: "+ iban);
        }
    }
}
