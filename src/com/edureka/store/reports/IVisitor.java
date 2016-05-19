package com.edureka.store.reports;

import com.edureka.store.domain.Item;
import com.edureka.store.domain.ShoppingComplex;
import com.edureka.store.domain.Store;

public interface IVisitor {
	public void visit(ShoppingComplex shopComplex);
	public void visit(Store store);
	public void visit(Item item);
}
