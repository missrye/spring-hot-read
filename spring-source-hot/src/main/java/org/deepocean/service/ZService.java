package org.deepocean.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ZService implements ApplicationContextAware {
    @Autowired
    private XService xService;

    /**
     * 构造方法
     */
    public ZService() {
        System.out.println("ZService create.");
    }

    /**
     * 生命周期初始化回调方法
     */
    @PostConstruct
    public void init() {
        System.out.println("Call zService lifecycle init callback");
    }

    /**
     * ApplicationContextAware 回调方法
     * @param applicationContext the ApplicationContext object to be used by this object
     * @throws BeansException BeansException
     */
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Call applicationContext callback.");
    }
}
