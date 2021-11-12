package com.kk.java;

public class City {

    private String cName;
    private String cCode;
    private String cDescription;

    public void setcName(String cName) {
        this.cName = cName;
    }

    public void setcCode(String cCode) {
        this.cCode = cCode;
    }

    public void setcDescription(String cDescription) {
        this.cDescription = cDescription;
    }

    @Override
    public String toString() {
        return "City{" +
                "cName='" + cName + '\'' +
                ", cCode='" + cCode + '\'' +
                ", cDescription='" + cDescription + '\'' +
                '}';
    }
}
