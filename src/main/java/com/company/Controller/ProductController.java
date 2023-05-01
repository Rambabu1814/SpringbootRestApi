package com.company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.Model.Product;
import com.company.Service.ProductService;

@RestController
@RequestMapping("/Rambabu")
public class ProductController {
    @Autowired
	ProductService productservice;
    
    @GetMapping("")
    List<Product> getProducts(){
    	 return productservice.getProducts();
    }
	
}
