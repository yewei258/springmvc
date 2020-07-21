package com.ye.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * 在非spring管理类中获取spring注册的类
 */
@Component
public class BeanTools implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        if (applicationContext == null) {
            applicationContext = context;
        }
    }

    public static <T> T getBean(Class<T> c) {
        return applicationContext.getBean(c);
    }

    public static <T> T getBean(String name, Class<T> c) {
        return applicationContext.getBean(name, c);
    }

    public static Object getBean(String name) {
        return applicationContext.getBean(name);
    }
}
