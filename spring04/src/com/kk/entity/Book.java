package com.kk.entity;

import java.math.BigDecimal;

public class Book {

    private String isbn;
    private String bName;
    private BigDecimal bPrice;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public BigDecimal getbPrice() {
        return bPrice;
    }

    public void setbPrice(BigDecimal bPrice) {
        this.bPrice = bPrice;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", bName='" + bName + '\'' +
                ", bPrice=" + bPrice +
                '}';
    }
}
