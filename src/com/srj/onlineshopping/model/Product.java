package com.srj.onlineshopping.model;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity(name="product")
public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="product_id")
	private int id;
	
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
	private int quantity;
	
	@Column(name="is_active")
	private boolean active;
	
	//@JoinColumn(name="category_id")
	//private Category category;
	@Column(name="category_id")
	@JsonIgnore
	private int categoryId;
	
	//@JoinColumn(name="supplier_id")
	//private Supplier supplier;
	@Column(name="supplier_id")
	@JsonIgnore
	private int supplierId;
	
	@Column(name="purcheses")
	private int purcheses;
	
	@Column(name="views")
	private int views;
	
	
	// default constructor
		public Product() {
			
			this.code = "PRD" + UUID.randomUUID().toString().substring(26).toUpperCase();
			
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
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


		public int getQuantity() {
			return quantity;
		}


		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}


		public boolean isActive() {
			return active;
		}


		public void setActive(boolean active) {
			this.active = active;
		}


		public int getCategoryId() {
			return categoryId;
		}


		public void setCategoryId(int categoryId) {
			this.categoryId = categoryId;
		}


		public int getSupplierId() {
			return supplierId;
		}


		public void setSupplierId(int supplierId) {
			this.supplierId = supplierId;
		}


		public int getPurcheses() {
			return purcheses;
		}


		public void setPurcheses(int purcheses) {
			this.purcheses = purcheses;
		}


		public int getViews() {
			return views;
		}


		public void setViews(int views) {
			this.views = views;
		}


		@Override
		public String toString() {
			return "Product [id=" + id + ", code=" + code + ", name=" + name + ", brand=" + brand + ", description="
					+ description + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", active=" + active
					+ ", categoryId=" + categoryId + ", supplierId=" + supplierId + ", purcheses=" + purcheses
					+ ", views=" + views + "]";
		}

	
	
	
	
	
}
