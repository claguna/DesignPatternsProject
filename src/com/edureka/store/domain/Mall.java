package com.edureka.store.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;



import java.util.Random;

import com.edureka.store.observer.NotifySalesObserver;

public class Mall extends ShoppingComplex   {
private String name;
private boolean isSales;
//private ArrayList<Store> storeList = new ArrayList<Store>();

public Mall() {
	// TODO Auto-generated constructor stub
	lstNotifySalesObserver = new ArrayList<NotifySalesObserver>();
	assignAttributestoMall();
}

List<NotifySalesObserver> lstNotifySalesObserver;



//private HashMap<String, Store> mapStore = new HashMap<String, Store>();

public void enter(){
	System.out.println("Enter the mall");
}


public ShoppingCart getShoppingCart(){
	System.out.println("Prepare shopping cart");
	return null;
}

public List<Item> getStoreItemList(StoreType storeType) {
	return null;
}





@Override
void assignManagement() {
	// TODO Auto-generated method stub
	setMgmt(new StoreManagement("pres", "direct", 4));
}


@Override
void assignBuiltUpSpace() {
	// TODO Auto-generated method stub
	setBuiltupSpace((int)((new Random((new Date()).getTime())).nextDouble()*100));
}


@Override
void assignStoreTimings() {
	// TODO Auto-generated method stub
	setStoreTimings("9a.mto8p.m");
}


@Override
public void addObserver(NotifySalesObserver notifySalesObserver) {
	// TODO Auto-generated method stub

	lstNotifySalesObserver.add(notifySalesObserver);
}


@Override
public void removeObserver(NotifySalesObserver customerObserver) {
	// TODO Auto-generated method stub
	lstNotifySalesObserver.remove(customerObserver);
}


@Override
public void doNotify() {
	// TODO Auto-generated method stub
	Iterator<NotifySalesObserver> itrObserver = lstNotifySalesObserver.iterator();
	while(itrObserver.hasNext()){
		NotifySalesObserver notifySalesObserver = (NotifySalesObserver)itrObserver.next();
		notifySalesObserver.doUpdate(true);
	}
	
}


public void setSales(boolean isSales) {
	this.isSales = isSales;
	if(isSales){
		doNotify();
	}
}





}
