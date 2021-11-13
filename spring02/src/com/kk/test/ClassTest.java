package com.kk.test;

import com.kk.bean.Emp;
import com.kk.java.Book;
import com.kk.java.City;
import com.kk.java.Order;
import com.kk.service.CityService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassTest {

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
    }

    @Test
    public void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Order order = context.getBean("order", Order.class);
        System.out.println(order);
    }

    @Test
    public void test3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        City city = context.getBean("city", City.class);
        System.out.println(city);
    }

    @Test
    public void test4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        CityService cityService = context.getBean("cityService", CityService.class);
        cityService.update();
    }

    @Test
    public void test5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
