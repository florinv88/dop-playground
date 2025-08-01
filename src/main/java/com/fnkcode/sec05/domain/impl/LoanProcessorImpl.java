package com.fnkcode.sec05.domain.impl;

import com.fnkcode.sec05.domain.contract.Loan;
import com.fnkcode.sec05.domain.contract.Loan.*;
import com.fnkcode.sec05.domain.contract.LoanStatus;
import com.fnkcode.sec05.domain.contract.Property.*;
import com.fnkcode.sec05.domain.contract.Vehicle.*;
import com.fnkcode.sec05.domain.service.LoanProcessor;

public class LoanProcessorImpl implements LoanProcessor {

    public static final String DENY_MESSAGE_FORMAT = "Credit score must be at least %d and income must be at least %d";

    @Override
    public LoanStatus handle(LoanStatus.Submitted submitted) {
        return switch (submitted.loan()){
            case PersonalLoan loan -> this.review(loan,600,50_000);
            case AutoLoan loan -> this.review(loan,650,60_000);
            case PropertyLoan loan -> this.review(loan,700,100_000);
        };
    }

    private LoanStatus review(Loan loan, int minScore, int minIncome) {
        var applicant = loan.application().applicant();
        return applicant.creditScore() >= minScore && applicant.income() >= minIncome ?
                new LoanStatus.Reviewed(loan) :
                new LoanStatus.Denied(loan, DENY_MESSAGE_FORMAT.formatted(minScore, minIncome));
    }

    @Override
    public LoanStatus handle(LoanStatus.Reviewed reviewed) {
        var loan = reviewed.loan();
        var interestRate = switch (loan){
            case PersonalLoan ignored -> 4.50;
            case AutoLoan(_, Car ignored ) -> 5.00;
            case AutoLoan(_, Motorcycle( _ ,int cc)) when cc < 500 -> 6.00;
            case AutoLoan(_, Motorcycle ignored ) -> 7.00;
            case PropertyLoan(_ , Commercial ignored ) -> 8.00;
            case PropertyLoan(_ , Residential(_, int rooms)) when rooms <4  -> 6.00;
            case PropertyLoan(_ , Residential ignored) -> 8.00;
        };
        return new LoanStatus.Approved(loan, interestRate);
    }
}
