package com.kk.bean;

public class Emp {

    private String eName;

    private Dept dept;

    //级联赋值时需要写getter方法来获取到对象，仅级联赋值时需要，注入内部bean时不需要
    public Dept getDept() {
        return dept;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eName='" + eName + '\'' +
                ", dept=" + dept +
                '}';
    }
}
