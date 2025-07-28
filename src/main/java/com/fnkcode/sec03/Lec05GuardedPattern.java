package com.fnkcode.sec03;

public class Lec05GuardedPattern {

    public static void main(String[] args) {
        patternMatch(2);
        patternMatch(7);
    }

    private static void patternMatch(Object obj) {
        switch (obj){
            case Double d-> System.out.println("double "+d);
            case Integer i when i>5 -> System.out.println("int bigger than 5 : "+i);
            case Integer i-> System.out.println("int "+i);
            case Number n-> System.out.println("number "+n);
            case null, default -> System.out.println("default ");
        }
    }
}
