package com.prodapt.CodeBasedAssignment;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class ElectronicShop {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	int cost;
	public ElectronicShop() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectronicShop(int id, String name, int cost) {
		this.id = id;
		this.name = name;
		this.cost = cost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "ElectronicShop [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
}
