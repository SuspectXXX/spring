package com.kk.service;

import com.kk.dao.CityDao;

public class CityService {

    private CityDao cityDao;
    //使用setter方法注入外部bean
    public void setCityDao(CityDao cityDao) {
        this.cityDao = cityDao;
    }

    public void update() {
        System.out.println("CityService update...");
        cityDao.update();
    }
}
