package com.tao.xbot.domain.order.model;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class Order {
    
    private Long id;
    
    private String orderNo;
    
    private Long productId;
    
    private Integer quantity;
    
    private BigDecimal amount;
    
    private String status;
    
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;
}
