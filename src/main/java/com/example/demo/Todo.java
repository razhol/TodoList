package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Entity
public class Todo {

	@Id
	@GeneratedValue
	private int item_number;
	
	private String name;
	private int amount;
	private int inventory_code;
	
	
	public Todo(int item_number, String name, int amount, int inventory_code) {
		super();
		this.item_number = item_number;
		this.name = name;
		this.amount = amount;
		this.inventory_code = inventory_code;
	}
	
    public Todo() {
    }
	

	public void setItem_number(int item_number) {
		this.item_number = item_number;
	}
	
	public int getItem_number() {
		return item_number;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getInventory_code() {
		return inventory_code;
	}
	public void setInventory_code(int inventory_code) {
		this.inventory_code = inventory_code;
	}

//	public Todo updateAmount(Todo todo, int numebr) {
//		todo.setAmount(this.amount - numebr);
//		return todo;
//		
//	}

	
	
}
