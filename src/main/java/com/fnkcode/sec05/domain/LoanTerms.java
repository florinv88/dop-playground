package com.fnkcode.sec05.domain;

public record LoanTerms(
        int amount,
        int duration
) {
    //ignore validation for simplicty
}
