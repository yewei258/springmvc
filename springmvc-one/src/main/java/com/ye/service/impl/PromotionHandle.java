package com.ye.service.impl;

import com.ye.service.AbstractHandle;
import com.ye.service.HandlerType;
import org.springframework.stereotype.Service;

@Service
@HandlerType("3")
public class PromotionHandle extends AbstractHandle {
    @Override
    public String handle(OrderDTO dto) {
        return "處理促銷訂單";
    }
}
