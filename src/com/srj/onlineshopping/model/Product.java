package com.srj.onlineshopping.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

@Entity(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private Long productId;
	
	@Column(name="code")
	private String code;
	
	@Column(name="name")
	private String name;
	
	@Column(name="brand")
	private String brand;
	
	@Column(name="description")
	private String description;
	
	@Column(name="unit_price")
	private Double unitPrice;
	
	@Column(name="quantity")
	private Long quantity;
	
	@Column(name="is_active")
	private boolean active;
	
	//@JoinColumn(name="category_id")
	//private Category category;
	@Column(name="category_id")
	private Long categoryId;
	
	//@JoinColumn(name="supplier_id")
	//private Supplier supplier;
	@Column(name="supplier_id")
	private Long supplierId;
	
	@Column(name="purcheses")
	private Long purcheses;
	
	@Column(name="views")
	private Long views;
	
	public Product(){
		this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
		//it will provide random unique id as soon as the product generated
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	public Long getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(Long supplierId) {
		this.supplierId = supplierId;
	}

	public Long getPurcheses() {
		return purcheses;
	}

	public void setPurcheses(Long purcheses) {
		this.purcheses = purcheses;
	}

	public Long getViews() {
		return views;
	}

	public void setViews(Long views) {
		this.views = views;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", code=" + code + ", name=" + name + ", brand=" + brand
				+ ", description=" + description + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", active="
				+ active + ", categoryId=" + categoryId + ", supplierId=" + supplierId + ", purcheses=" + purcheses
				+ ", views=" + views + "]";
	}

	
	
	
	
}
