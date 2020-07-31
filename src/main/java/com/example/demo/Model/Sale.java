package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="MyCoffeeShop")
public class Sale {
	
	@Id @GeneratedValue
	@Column(unique=true)
	private int salesid;
	@Column(name="ProductID")
	private int pid;
	@Column(length=20, name="Product")
	private String product_name;
//	private String description;
	private int quantity;
	private double price;
	
	@Transient
	private float amount;
	@Transient
	private float vat;
	@Transient
	private double netamount;
	
	
	public int getSalesid() {
		return salesid;
	}
	public void setSalesid(int salesid) {
		this.salesid = salesid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
//	public String getDescription() {
//		return description;
//	}
//	public void setDescription(String description) {
//		this.description = description;
//	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public float getVat() {
		return vat;
	}
	public void setVat(float vat) {
		this.vat = vat;
	}
	public double getNetamount(double d) {
		return netamount;
	}
	public void setNetamount(double netamount) {
		this.netamount = netamount;
	}
	
	
	
	
}
	
	
	
