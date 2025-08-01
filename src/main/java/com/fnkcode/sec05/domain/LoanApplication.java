package com.fnkcode.sec05.domain;

public record LoanApplication(
        Applicant applicant,
        LoanTerms loanTerms
) {
    //ignore validation for simplicty
}
