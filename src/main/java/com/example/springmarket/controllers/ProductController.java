package com.example.springmarket.controllers;

import com.example.springmarket.models.Product;
import com.example.springmarket.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String products(Model model){
        model.addAttribute("products", productService.getProductList());
        return "products";
    }

    @GetMapping("/{id}")
    public String infoProduct(@PathVariable("id") int id,
                              Model model){
        model.addAttribute("product", productService.getProductById(id));
        return "product-info";
    }

    @PostMapping("/create")
    public String createProduct(Product product){
        productService.saveProduct(product);
        return "redirect:/product/";
    }

    @PostMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") int id){
        productService.deleteProduct(id);
        return "redirect:/product/";
    }

}
