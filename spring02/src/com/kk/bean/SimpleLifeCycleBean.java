package com.kk.bean;

public class SimpleLifeCycleBean {

    private String name;

    public SimpleLifeCycleBean() {
        System.out.println("1");
    }

    public void setName(String name) {
        this.name = name;
        System.out.println("2");
    }

    /**
     * 初始化方法需要在bean定义中进行配置
     */
    public void initialMethod() {
        System.out.println("3");
    }

    /**
     * 销毁的方法需要在bean定义中进行配置
     * 同时销毁时时因为容器销毁导致bean的销毁
     */
    public void destoryMethod() {
        System.out.println("5");
    }

    @Override
    public String toString() {
        return "SimpleLifeCycleBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
