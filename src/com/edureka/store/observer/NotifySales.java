package com.edureka.store.observer;

import com.edureka.store.domain.Customer;


public abstract class NotifySales {
	public abstract void addObserver(NotifySalesObserver customerObserver);
	public abstract void removeObserver(NotifySalesObserver customerObserver);
	public abstract void doNotify();		
}
