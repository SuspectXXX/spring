package com.kk.java.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class Order {

    @Autowired
    private Order1 order1;

    @Autowired
    @Qualifier(value = "order2")
    private Order2 order2;

    @Resource
    private Order3 order3;

    @Value(value = "abc")
    private String s;

    @Value(value = "1")
    private int oId;

    @Override
    public String toString() {
        return "Order{" +
                "order1=" + order1 +
                ", order2=" + order2 +
                ", order3=" + order3 +
                ", s='" + s + '\'' +
                ", oId=" + oId +
                '}';
    }
}
