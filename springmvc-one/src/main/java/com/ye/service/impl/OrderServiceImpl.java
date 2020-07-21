package com.ye.service.impl;

import com.ye.service.AbstractHandle;
import com.ye.service.HandleContext;
import com.ye.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    private HandleContext handleContext;
    @Autowired
    public OrderServiceImpl(HandleContext handleContext) {
        this.handleContext = handleContext;
    }

    @Override
    public String handle(OrderDTO dto) {
        AbstractHandle handle = handleContext.getInstance(dto.getOrderType());
        return handle.handle(dto);
    }
}
