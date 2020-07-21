package com.ye.service;

import com.ye.domain.Student;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.XmlWebApplicationContext;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;

/**
 * 在项目启动的时候可以获取到自定义注解标注的类
 */
@Component
public class HandleProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Map<String, Object> beansWithAnnotation = beanFactory.getBeansWithAnnotation(HandlerType.class);

        Map<String, Class<AbstractHandle>> map = new HashMap<>(3);

        for (Map.Entry<String, Object> en : beansWithAnnotation.entrySet()) {
            AbstractHandle handle = (AbstractHandle) en.getValue();
            String value = handle.getClass().getAnnotation(HandlerType.class).value();
            map.put(value, (Class<AbstractHandle>) handle.getClass());
        }
        HandleContext context = new HandleContext(map);
        beanFactory.registerSingleton(HandleContext.class.getName(), context);
    }
}
