package com.fnkcode.sec03;

import java.util.Collection;

public class Lec03TypePattern {

    public static void main(String[] args) {

    }

    private static boolean isEmpty(Object obj) {
        //type pattern = the new switch + instanceoff with pattern variable

        return switch (obj) {
            case null -> true;
            case String string -> string.isEmpty(); //pattern variable
            case Collection<?> collection -> collection.isEmpty();
            //... and so on

            default -> false;
        };
    }
}
