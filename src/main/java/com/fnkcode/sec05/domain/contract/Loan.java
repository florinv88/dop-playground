package com.fnkcode.sec05.domain.contract;

import com.fnkcode.sec05.domain.LoanApplication;

public sealed interface Loan {

    LoanApplication application();

    record PersonalLoan(LoanApplication application) implements Loan {
    }

    record PropertyLoan(LoanApplication application, Property property) implements Loan {
    }

    record AutoLoan(LoanApplication application, Vehicle vehicle) implements Loan {
    }
}
