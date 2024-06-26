package com.icycodes.ProductService.Service;

import com.icycodes.ProductService.Entity.Product;
import com.icycodes.ProductService.Entity.ProductRepository;
import com.icycodes.ProductService.Model.ProductRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;
import java.util.logging.Logger;

@Service
@Log4j2
public class ProductServiceImpl implements ProductService{

    @Autowired
    private Logger logger;

    @Autowired
    private ProductRepository productRepository;


    @Override
    public String addProduct(ProductRequest productRequest) {
        log.info("adding product start");

        Product product = Product.builder()
                .productName(productRequest.getName())
                .price(productRequest.getPrice())
                .quantity(productRequest.getQuantity())
                .build();
        log.info("product obj created");
        System.out.println(product);

        productRepository.save(product);

        log.info("product saved in database");
        log.info(product.getProductId());
        return UUID.fromString(product.getProductId());
    }
}
