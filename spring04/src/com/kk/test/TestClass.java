package com.kk.test;

import com.kk.dao.AccountDao;
import com.kk.dao.BookDao;
import com.kk.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.io.FileNotFoundException;
import java.math.BigDecimal;

public class TestClass {

    @Test
    public void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/bean.xml");
        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        System.out.println(jdbcTemplate);
    }

    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/bean.xml");
        AccountDao accountDao = context.getBean("accountDao", AccountDao.class);
        accountDao.updateBalance(1, new BigDecimal(10));
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        BigDecimal bPrice = bookDao.getBookPrice("ISBN-001");
        System.out.println(bPrice);
        bookDao.subBookStock("ISBN-001", 5);
    }

    @Test
    public void test2() throws FileNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("conf/bean.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        bookService.checkout(1, "ISBN-001", 1);
    }

}
