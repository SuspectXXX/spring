package com.kk.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 会给所有bean都加上
 * 同时该bean也需要在xml文件中进行配置
 */
public class PostProcessor implements BeanPostProcessor {
    /**
     * 在初始化之前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("before 3");
        return null;
    }

    /**
     * 在初始化之后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("after 3");
        return null;
    }
}
