package com.fnkcode.sec03;

import java.util.List;

public class Lec01InstanceOf {

    public static void main(String[] args) {
        System.out.println(isEmpty(null));
        System.out.println(isEmpty("test"));
        System.out.println(isEmpty(List.of()));

    }

    public static boolean isEmpty(Object obj) {
        if (obj == null) {
            return true;
        } else if (obj instanceof String string) { //pattern variable
            return string.isEmpty();
        } else if (obj instanceof List list) {
            return list.isEmpty();
        } //etc
        return false;
    }

}
