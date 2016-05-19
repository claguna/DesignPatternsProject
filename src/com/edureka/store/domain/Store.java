package com.edureka.store.domain;

import java.awt.ItemSelectable;
import java.util.ArrayList;
import java.util.HashMap;

import com.edureka.store.reports.IVisitable;
import com.edureka.store.reports.IVisitor;

public abstract class Store implements IVisitable {
	private StoreType storeType=null;
private String name;
private String storeId;
private HashMap<String, Item> itmList = new HashMap<String, Item>();
public Store(StoreType storeType) {
	super();
	this.storeType = storeType;
}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void setItemList(HashMap<String, Item> itmList) {
	this.itmList = itmList;
}



public HashMap<String, Item> getItmList() {
	return itmList;
}



public int sizeOfStore(){
	return itmList.size();
}

public Item getItemfromStore(String itemID){
	return itmList.get(itemID) ;
}

public void accept(IVisitor visitor){
	visitor.visit(this);
}

public abstract void enter();

}


