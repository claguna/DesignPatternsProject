package com.edureka.store.domain;

import com.edureka.store.reports.IBillingVisitor;

/*
 * Represents the CartItem in the Shopping Cart
 */
public class CartItem {
private Item item;
private int quantity;

public Item getItem() {
	return item;
}
public void setItem(Item item) {
	this.item = item;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}

public void incrementQuantity() {
	quantity++;
}

public void accept(IBillingVisitor visitor) {
	visitor.visit(this);
	
}

}
