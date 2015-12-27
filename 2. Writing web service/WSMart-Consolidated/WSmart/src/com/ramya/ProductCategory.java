package com.ramya;

import java.util.List;

import javax.jws.WebService;

import com.ramya.service.ProductServiceImpl;

@WebService
public class ProductCategory {
	ProductServiceImpl productServiceImpl = new ProductServiceImpl(); 
	
	public List<String> getProductCategories() {
		return productServiceImpl.getProductCategories();
	}
	
	public List<String> getProductsByCategory(String category) {
		return productServiceImpl.getProductByCategory(category);
	}
	
	public boolean addProductsByCategory(String category, String product) {
		return productServiceImpl.addProductToCategory(category, product);
	}
}