package com.edureka.store.domain;

import java.awt.event.ItemListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.edureka.store.reports.IBillingVisitable;
import com.edureka.store.reports.IBillingVisitor;
import com.edureka.store.reports.IVisitable;
import com.edureka.store.reports.IVisitor;

public class ShoppingCart implements IBillingVisitable {
private HashMap<String, CartItem> itemsMap = new HashMap<String, CartItem>();

public void addItem(Item item){
	CartItem cartItem = itemsMap.get(item.getId());
	if(cartItem==null){
		cartItem = new CartItem();
		cartItem.setItem(item);
		cartItem.setQuantity(0);
		itemsMap.put(item.getId(), cartItem);
	}
	
	cartItem.incrementQuantity();
}

public double getSubTotal(){
	Iterator itr = itemsMap.entrySet().iterator();
	double subTotal=0.0;
	while(itr.hasNext()){
		Map.Entry pair = (Map.Entry)itr.next();
		CartItem cartItem = (CartItem)pair.getValue();
		subTotal = subTotal + cartItem.getQuantity()*((cartItem.getItem()).getPrice());
	}
	return subTotal;
}

@Override
public void accept(IBillingVisitor visitor) {
	visitor.visit(this);
	Iterator itr = itemsMap.entrySet().iterator();
	
	while(itr.hasNext()){
		Map.Entry pair = (Map.Entry)itr.next();
		CartItem cartItem = (CartItem)pair.getValue();
		cartItem.accept(visitor);
	}
	
}

}
