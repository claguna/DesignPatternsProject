package com.edureka.store.reports;

import com.edureka.store.domain.CartItem;
import com.edureka.store.domain.ShoppingCart;

public interface IBillingVisitor {
	public void visit(ShoppingCart shopCart);
	public void visit(CartItem item);
}
