package com.youtube.jwt.service;

import com.youtube.jwt.dao.ProductDao;
import com.youtube.jwt.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;



    public Product addNewProduct(Product product) {
        return productDao.save(product);
    }

}
