package com.tao.xbot.domain.product.model;

import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class Product {
    
    private Long id;
    private String name;
    private String nameEn;
    private String category;
    private List<String> specs;
    private String certifications;
    private BigDecimal price;
    private Integer stock;
    private String description;
    private String descriptionEn;
    private List<String> images;
    private Integer status;
    private Integer deleted;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
