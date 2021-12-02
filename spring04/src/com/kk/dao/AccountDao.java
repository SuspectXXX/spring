package com.kk.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;

@Repository
public class AccountDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    /**
     * 修改用户余额
     */
    public void updateBalance(Integer uId, BigDecimal price) {
        String sql = "update account set uBalance = uBalance - ? where uId = ?";
        jdbcTemplate.update(sql, price, uId);
    }
}
