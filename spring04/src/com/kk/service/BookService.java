package com.kk.service;

import com.kk.dao.AccountDao;
import com.kk.dao.BookDao;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.math.BigDecimal;

@Service
public class BookService {

    @Autowired
    AccountDao accountDao;

    @Autowired
    BookDao bookDao;

    public void test() {
        ((BookService)AopContext.currentProxy()).checkout(1, "ISBN-001", 5);
    }

    /**
     * 结账
     */
    @Transactional(rollbackFor = {FileNotFoundException.class})
    public void checkout(Integer uId, String isbn, Integer num){
        bookDao.subBookStock(isbn, num);
        BigDecimal bPrice = bookDao.getBookPrice(isbn);
        accountDao.updateBalance(uId, bPrice);
//        new FileInputStream("F:\\hahah.txt");

    }


}
