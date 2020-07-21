package com.ye.service.impl;

import com.ye.service.AbstractHandle;
import com.ye.service.HandlerType;
import org.springframework.stereotype.Service;

@Service
@HandlerType("2")
public class GroupHandle extends AbstractHandle {
    @Override
    public String handle(OrderDTO dto) {

        return "处理团队订单";
    }
}
