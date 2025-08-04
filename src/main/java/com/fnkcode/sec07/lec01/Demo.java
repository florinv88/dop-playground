package com.fnkcode.sec07.lec01;

import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.Path;
import com.fnkcode.sec07.lec01.Result.*;

public class Demo {

    public static void main(String[] args) {

    }

    private static void readFile(Path path) {
        switch (FileReader.readFile(path)){
            case Success(String data) -> System.out.println(data);
            case Failure(AccessDeniedException e)-> System.out.println("Access denied : "+ e.getMessage());
            case Failure(IOException e)-> System.out.println("IO exception : "+ e.getMessage());
            case Failure(Throwable e)-> System.out.println("Error : "+ e.getMessage());
        }
    }
}
