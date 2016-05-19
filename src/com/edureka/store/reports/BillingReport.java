package com.edureka.store.reports;

import com.edureka.store.domain.CartItem;
import com.edureka.store.domain.Item;
import com.edureka.store.domain.ShoppingCart;

public class BillingReport implements IBillingVisitor {

	double subTotal=0.0;
	@Override
	public void visit(ShoppingCart shopCart) {
		// TODO Auto-generated method stub
		System.out.println("BillingReport:visit(ShoppingCart) : set some attributes");
	}

	@Override
	public void visit(CartItem cartItem) {
		// TODO Auto-generated method stub
		subTotal = subTotal + cartItem.getQuantity()*((cartItem.getItem()).getPrice());
	}

	public double getSubTotal() {
		return subTotal;
	}
	
	

}
