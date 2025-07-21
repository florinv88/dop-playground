package com.fnkcode.sec03;

public class Lec04PatternLabelDominance {

    public static void main(String[] args) {
        patternMatch(2);
    }

    private static void patternMatch(Object obj) {
        switch (obj){
            case Double d-> System.out.println("double "+d);
            case Integer i-> System.out.println("int "+i);
            case Number n-> System.out.println("number "+n);
            case null, default -> System.out.println("default ");
        }
    }
}
