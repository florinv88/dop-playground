package com.fnkcode.sec03;

import java.net.http.HttpTimeoutException;

public class Lec07RecordPattern {

    public static void main(String[] args) {

    }

    //just for demo , not the best way of doing this
    record ApiResponse<T>(T success,Throwable error){}

    // only record classes can be deconstructed (a normal object cannot)
    private static void patternMatch(ApiResponse<?> response) {
        switch (response){
            case ApiResponse(Integer success, _) -> System.out.println("integer response " + success);
            case ApiResponse(String success, _) -> System.out.println("String response "+success);
            case ApiResponse(_ , HttpTimeoutException ex) -> System.out.println("exeception "+ex.getMessage());
            case null,default -> System.out.println("default ");

        }
    }

}
