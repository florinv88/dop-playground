package com.fnkcode.sec03;

public class Lec02SwitchExpresion {

    public static void main(String[] args) {

        System.out.println(ronToCurrency(34L,"EUR"));

    }

    public static Long ronToCurrency(Long amount, String currency) {
        //dummy values
        var multiplier = switch (currency) {
            case "USD" -> 3L;
            case "EUR" -> 5L;
            case "GBP","LEK" -> 2L;
            case "CHF" -> {
                System.out.println("aulu elvetia");
                yield 69L;
            }
            case null -> throw new IllegalArgumentException("currency is null");
            default -> 1L;
        };

        return amount*multiplier;
    }
}
