package com.kk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;


@Repository
public class BookDao {

    @Autowired
    JdbcTemplate jdbcTemplate;
    /**
     * 获取图书的价格
     */
    public BigDecimal getBookPrice(String isbn) {
        String sql = "select bPrice from book where isbn = ?";
        BigDecimal bPrice = jdbcTemplate.queryForObject(sql, BigDecimal.class, isbn);
        return bPrice;
    }

    /**
     * 图书减库存
     */
    public void subBookStock(String isbn, Integer num) {
        String sql = "update book_stock set stock = stock - ? where isbn = ?";
        jdbcTemplate.update(sql, num, isbn);
    }

}
