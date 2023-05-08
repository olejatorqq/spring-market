package com.example.springmarket.services;

import com.example.springmarket.models.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();
    private int ID = 0;

    {
        productList.add(new Product(++ID, "Nokia 3310", "phone", 500, "Moscow", "Ivan Ivanov"));
        productList.add(new Product(++ID, "Iphone 11", "phone", 35000, "Moscow", "Ilya Moskalev"));
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void saveProduct(Product product){
        product.setId(++ID);
        productList.add(product);
    }

    public void deleteProduct(int id){
        productList.removeIf(product -> product.getId() == id);
    }

    public Product getProductById(int id){
        return productList.stream().filter(product -> product.getId() == id).findAny().orElse(null);
    }

}
