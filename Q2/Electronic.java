package com.prodapt.SpringBootBasics.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name= "Orders")
public class Electronic {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	public String name;
	public int cost;
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
		return "Order [id=" + id + ", name=" + name + ", cost=" + cost + "]";
	}
	public Electronic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Electronic(int id, String name, int cost) {
		super();
		this.id = id;
		this.name = name;
		this.cost = cost;
	}

}
