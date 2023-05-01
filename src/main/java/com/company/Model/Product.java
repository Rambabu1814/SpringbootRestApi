package com.company.Model;

public class Product {
 
private long productID;
private String productName;
private Integer productPrice;
public Product() {
	super();
}
public Product(long productID, String productName, Integer productPrice) {
	super();
	this.productID = productID;
	this.productName = productName;
	this.productPrice = productPrice;
}

	

public long getProductID() {
	return productID;
}
public void setProductID(long productID) {
	this.productID = productID;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public Integer getProductPrice() {
	return productPrice;
}
public void setProductPrice(Integer productPrice) {
	this.productPrice = productPrice;
}



}
