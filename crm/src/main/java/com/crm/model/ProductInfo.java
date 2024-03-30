package com.crm.model;

import java.util.Date;

public class ProductInfo {

	private String id;
	private String productcode;
	private Date pricedate;
	private String price;
	private String weight;
	private String is_delete;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductcode() {
		return productcode;
	}
	public void setProductcode(String productcode) {
		this.productcode = productcode;
	}
	public Date getPricedate() {
		return pricedate;
	}
	public void setPricedate(Date pricedate) {
		this.pricedate = pricedate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(String is_delete) {
		this.is_delete = is_delete;
	}
	
	
	
}
