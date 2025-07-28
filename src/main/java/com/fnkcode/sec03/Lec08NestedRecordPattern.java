package com.fnkcode.sec03;

import java.net.http.HttpTimeoutException;

public class Lec08NestedRecordPattern {

    public static void main(String[] args) {

    }

    //just for demo , not the best way of doing this
    record ApiResponse<T>(T success,Throwable error){}

    record Product(String name, int price){}
    record User(String name, int age){}

    // only record classes can be deconstructed (a normal object cannot)
    private static void patternMatch(ApiResponse<?> response) {
        switch (response){
            case ApiResponse(Integer success, _) -> System.out.println("integer response " + success);
            case ApiResponse(String success, _) -> System.out.println("String response "+success);
            case ApiResponse(_ , HttpTimeoutException ex) -> System.out.println("exeception "+ex.getMessage());
            //deconstruct another step to get the fields from record
            //or don t and access them by parent
            case ApiResponse(Product(String name, _ ), _) -> System.out.println("product response with name : "+name);
            case ApiResponse(User user, _) -> System.out.println("user response with name : "+user.name());
            case null,default -> System.out.println("default ");

        }
    }

}
