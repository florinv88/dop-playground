package com.fnkcode.sec07.lec01;

public sealed interface Result<T> {

    record Success<T>(T result) implements Result<T> {
    }

    record Failure<T>(Throwable error) implements Result<T> {
    }

    static <T> Result<T> success(T result) {
        return new Success<>(result);
    }
    static <T> Result<T> failure(Throwable throwable) {
        return new Failure<>(throwable);
    }

    default T orElse(T defaultValue) {
        return switch (this) {
            case Success(T data) -> data;
            case Failure(_) -> defaultValue;
        };
    }
}
