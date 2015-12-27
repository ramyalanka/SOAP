package com.ramya.service;

import java.util.ArrayList;
import java.util.List;

import com.ramya.model.Product;

public class ProductServiceImpl {
	private List<String> booksList = new ArrayList<String>();
	private List<String> pensList = new ArrayList<String>();
	private List<String> giftsList = new ArrayList<String>();
	
	public ProductServiceImpl() {
		booksList.add("Tom and Jerry");
		booksList.add("Harry Potter");
		booksList.add("Panchatrantra");
		
		pensList.add("Reynolds");
		pensList.add("Parker");
		pensList.add("Sparker");
		
		giftsList.add("Flowers");
		giftsList.add("Heart baloons");
		giftsList.add("cards");
	}
	
	public List<String> getProductCategories() {
		List<String> categories = new ArrayList<String>();
		categories.add("books");
		categories.add("pens");
		categories.add("gifts");
		return categories;
	}
	
	public List<String> getProductByCategory(String category) {
		if(category.equalsIgnoreCase("books")){
			return booksList;
		} else if(category.equalsIgnoreCase("pens")) {
			return pensList;
		} else if(category.equalsIgnoreCase("gifts")) {
			return giftsList;
		}
		
		return null;
	}
	
	public boolean addProductToCategory(String category, String product){
		if(category.equalsIgnoreCase("books")){
			booksList.add(product);
			return true;
		} else if(category.equalsIgnoreCase("pens")) {
			pensList.add(product);
			return true;
		} else if(category.equalsIgnoreCase("gifts")) {
			giftsList.add(product);
			return true;
		}
		
		return false;
	}
	
	public List<Product> getProducts() {
		List<Product> productList = new ArrayList<Product>();
		
		productList.add(new Product("Spring In Action", 938.09, 1998));
		productList.add(new Product("Spring Pro", 898.79, 2000));
		
		return productList;
	}
}
