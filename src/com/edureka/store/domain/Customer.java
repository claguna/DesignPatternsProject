package com.edureka.store.domain;


/*
 * The Custome object which is associated to shopping cart
 * Also it acts as observer for any sales happening at the mall
 */

import com.edureka.store.observer.NotifySalesObserver;

public class Customer extends NotifySalesObserver {
private String name;
private ShoppingCart shoppingCart; //the shopping cart being used by the customer 
private Store store; // the store the customer is currently in

public Customer(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public ShoppingCart getShoppingCart() {
	return shoppingCart;
}
public void setShoppingCart(ShoppingCart shoppingCart) {
	this.shoppingCart = shoppingCart;
}
public Store getStore() {
	return store;
}
public void setStore(Store store) {
	this.store = store;
}
@Override
public void doUpdate(boolean isSales) {
	// TODO Auto-generated method stub
	System.out.println("Customer:NotifySalesObserver doUpdate : Sales Happening :"+this.getName());
}




}
