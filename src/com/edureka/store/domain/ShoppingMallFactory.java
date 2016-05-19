package com.edureka.store.domain;

import com.edureka.store.process.StoreSingleton;

public class ShoppingMallFactory {

	public static ShoppingComplex buildMall(){
		Mall m1=null;
		
		m1 = new Mall();
		
		StoreSingleton storeSingle = StoreSingleton.getInstance();
		m1.setStoreList(storeSingle.getLstStore());
		//m1.a
		return m1;
	}
}
