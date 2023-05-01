package com.company.Service;

import java.util.ArrayList;
import java.util.List;

import com.company.Model.Product;


public class ProductServiceImpl implements ProductService{

	@Override
	public List<Product> getProducts() {
		List<Product> products = new ArrayList<Product>();
		products.add(new Product(1l,"iphone",2000));
		products.add(new Product(3l,"speaker",500));
		products.add(new Product(1l,"book",100));
		return products;
	}

	
	
	
	

}
