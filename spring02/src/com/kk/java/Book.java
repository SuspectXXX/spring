package com.kk.java;

public class Book {

    private String bAuthor;
    private String bName;

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bAuthor='" + bAuthor + '\'' +
                ", bName='" + bName + '\'' +
                '}';
    }
}
