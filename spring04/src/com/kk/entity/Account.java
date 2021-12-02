package com.kk.entity;

import java.math.BigDecimal;

public class Account {

    private Integer uId;
    private String uName;
    private BigDecimal uBalance;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public BigDecimal getuBalance() {
        return uBalance;
    }

    public void setuBalance(BigDecimal uBalance) {
        this.uBalance = uBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uId=" + uId +
                ", uName='" + uName + '\'' +
                ", uBalance=" + uBalance +
                '}';
    }
}
