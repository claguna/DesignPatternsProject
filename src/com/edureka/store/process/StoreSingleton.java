package com.edureka.store.process;

import java.util.ArrayList;
import java.util.HashMap;

import com.edureka.store.domain.Item;
import com.edureka.store.domain.Mall;
import com.edureka.store.domain.Store;
import com.edureka.store.domain.StoreFactory;
import com.edureka.store.domain.StoreType;

public final class StoreSingleton {
private static volatile StoreSingleton instance = null;
private static HashMap<String, Store> lstStore =null;

private StoreSingleton(){
	createStores();
}

public static StoreSingleton getInstance(){
	if(instance==null){
		synchronized (StoreSingleton.class) {
			instance = new StoreSingleton();
			//createStores();
		}
	}
	return instance;
}

private void createStores(){

	//Mall mall = new Mall();
	
	// creating the stores. this code has to shift to Mall factory
	
	lstStore = new HashMap<String, Store>();	
	
	lstStore.put(StoreType.BOOK.toString(),StoreFactory.buildStore(StoreType.BOOK,createBookItemListMall("123")));
	lstStore.put(StoreType.SHOE.toString(),StoreFactory.buildStore(StoreType.SHOE,createShoeItemListMall("345")));
	
	
}



private static HashMap<String, Item> createBookItemListMall(String storeId){
	//ArrayList<Item> booklist = new ArrayList<Item>();
	HashMap<String, Item> booklist = new HashMap<String, Item>();
	booklist.put("1_bk1_mall1",new ItemBuilder().
			name("Book1_Mall1").
			id("1_bk1_mall1").
			storeId(storeId).price(99).build());
	booklist.put("2_bk1_mall1",new ItemBuilder().
			name("Book2_Mall1").
			id("2_bk1_mall1").
			storeId(storeId).price(99).build());
	return booklist;
}

private static HashMap<String, Item> createShoeItemListMall(String storeId){
	HashMap<String, Item> shoeList = new HashMap<String, Item>();
	shoeList.put("1_shoe1_mall1",new ItemBuilder().
			name("Shoe1_Mall1").
			id("1_shoe1_mall1").
			storeId(storeId).price(98).build());
	/*shoeList.put("2_shoe2_mall1",new ItemBuilder().
			name("Shoe2_Mall1").
			id("2_shoe2_mall1").
			storeId(storeId).price(101).build());*/
	return shoeList;
}

public static HashMap<String, Store> getLstStore() {
	return lstStore;
}



}
