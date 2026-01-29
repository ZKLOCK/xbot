package com.tao.xbot.domain.product.service;

import com.tao.xbot.domain.product.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    
    public List<Product> listProducts(int page, int size) {
        return new ArrayList<>();
    }
    
    public Product getProductById(Long id) {
        return null;
    }
    
    public void saveProduct(Product product) {
        // Save product
    }
}
