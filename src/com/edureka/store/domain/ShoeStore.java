package com.edureka.store.domain;

import java.util.ArrayList;
import java.util.HashMap;

public class ShoeStore extends Store {

	
	public ShoeStore(HashMap<String, Item> itmList) {
		super(StoreType.SHOE);
		// TODO Auto-generated constructor stub
		setItemList(itmList);
		setName("ShoeStore");
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}

}
