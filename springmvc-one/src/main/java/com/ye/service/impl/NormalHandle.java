package com.ye.service.impl;

import com.ye.service.AbstractHandle;
import com.ye.service.HandlerType;
import org.springframework.stereotype.Service;

@Service
@HandlerType("1")
public class NormalHandle extends AbstractHandle {
    @Override
    public String handle(OrderDTO dto) {

        return "处理建单订单";
    }
}
