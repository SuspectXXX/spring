package com.kk.entity;

public class NonStaticFactory {

    public Student getStudent(String sName, Integer sId) {
        Student student = new Student();
        student.setsId(sId);
        student.setsName(sName);
        return student;
    }
}
