package com.edureka.store.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class StoreFactory {

	public static Store buildStore(StoreType storeType,HashMap<String, Item> itmList){
		Store store=null;
		switch(storeType){
		case BOOK:
			store = new BookStore(itmList);
			break;
		case SHOE:
			store = new ShoeStore(itmList);
			break;
			
		default :
			break;
		}
		return store;
	}
}
