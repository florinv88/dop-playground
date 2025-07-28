package com.fnkcode.sec03;

public class Lec06UnnamedVariable {

    public static void main(String[] args) {
        patternMatch(2);
        patternMatch(7);
    }

    private static void patternMatch(Object obj) {
        switch (obj){
            //if we don't use the pattern variable we can either name it :  ignored or _
            case Double ignored -> System.out.println("received double");
            case Integer _ -> System.out.println("received int");
            case null, default -> System.out.println("default ");
        }
    }
}
