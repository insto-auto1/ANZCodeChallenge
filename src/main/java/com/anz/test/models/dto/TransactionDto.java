package com.anz.test.models.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import com.anz.test.models.CurrencyCode;
import com.anz.test.models.DebitCredit;

public class TransactionDto implements Serializable
{
    private Long transactionId;
    private String accountNumber;
    private String accountName;
    private Date valueDate;
    private CurrencyCode currencyCode;
    private BigDecimal debitAmount;
    private BigDecimal creditAmount;
    private DebitCredit debitCredit;
    private String transactionNarrative;

    public TransactionDto() {
    }

    public TransactionDto(String accountNumber, String accountName, Date valueDate, CurrencyCode currencyCode, BigDecimal debitAmount, BigDecimal creditAmount, DebitCredit debitCredit, String transactionNarrative) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.valueDate = valueDate;
        this.currencyCode = currencyCode;
        this.debitAmount = debitAmount;
        this.creditAmount = creditAmount;
        this.debitCredit = debitCredit;
        this.transactionNarrative = transactionNarrative;
    }

    public Long getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Long transactionId) {
        this.transactionId = transactionId;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Date getValueDate() {
        return valueDate;
    }

    public void setValueDate(Date valueDate) {
        this.valueDate = valueDate;
    }

    public CurrencyCode getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(CurrencyCode currencyCode) {
        this.currencyCode = currencyCode;
    }

    public BigDecimal getDebitAmount() {
        return debitAmount;
    }

    public void setDebitAmount(BigDecimal debitAmount) {
        this.debitAmount = debitAmount;
    }

    public BigDecimal getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(BigDecimal creditAmount) {
        this.creditAmount = creditAmount;
    }

    public DebitCredit getDebitCredit() {
        return debitCredit;
    }

    public void setDebitCredit(DebitCredit debitCredit) {
        this.debitCredit = debitCredit;
    }

    public String getTransactionNarrative() {
        return transactionNarrative;
    }

    public void setTransactionNarrative(String transactionNarrative) {
        this.transactionNarrative = transactionNarrative;
    }
}
