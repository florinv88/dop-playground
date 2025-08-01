package com.fnkcode.sec05.domain;

public record Applicant(
        String name,
        int creditScore,
        int income
) {
    //ignore validation for simplicty
}
