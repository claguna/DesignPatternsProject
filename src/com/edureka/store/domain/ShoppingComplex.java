package com.edureka.store.domain;

import java.util.HashMap;

import com.edureka.store.observer.NotifySales;
/*
 * Shopping complex object is an abstract interface for malls.
 */

public abstract class ShoppingComplex extends NotifySales {
	private String complexID;
	private Management mgmt;
	private int builtupSpace;
	private String storeTimings;
	
	private HashMap<String, Store> mapStore = new HashMap<String, Store>();
	
	/*
	 * Template Method Pattern to assign the attributes
	 */
	public final void assignAttributestoMall(){
		assignManagement();
		assignBuiltUpSpace();
		assignStoreTimings();
	}
	
	abstract void assignManagement();
	abstract void assignBuiltUpSpace();
	abstract void assignStoreTimings();

	public String getComplexID() {
		return complexID;
	}

	public void setComplexID(String complexID) {
		this.complexID = complexID;
	}
	
	public void setStoreList(HashMap<String, Store> mapStore) {
		this.mapStore = mapStore;
	}

	public HashMap<String, Store> getStoreList(){
		return mapStore;
	}

	public void setMgmt(Management mgmt) {
		this.mgmt = mgmt;
	}

	public int getBuiltupSpace() {
		return builtupSpace;
	}

	public void setBuiltupSpace(int builtupSpace) {
		this.builtupSpace = builtupSpace;
	}

	public String getStoreTimings() {
		return storeTimings;
	}

	public void setStoreTimings(String storeTimings) {
		this.storeTimings = storeTimings;
	}
	
	
	
	
	
}
