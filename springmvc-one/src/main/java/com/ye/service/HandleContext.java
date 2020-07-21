package com.ye.service;

import com.ye.utils.BeanTools;

import java.util.Map;

public class HandleContext {
    private Map<String,Class<AbstractHandle>> handleMap;

    public HandleContext(Map<String, Class<AbstractHandle>> handleMap) {
        this.handleMap = handleMap;
    }

    public AbstractHandle getInstance(String orderType){
        Class<AbstractHandle> clazz = handleMap.get(orderType);
        if(clazz == null){
            throw new IllegalArgumentException("not fond handle for type: " + orderType);
        }
        AbstractHandle bean = BeanTools.getBean(clazz);
        return bean;
    }
}
