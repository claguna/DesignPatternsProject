package com.edureka.store.domain;

import java.util.ArrayList;

/*
 * Urban Dev Authority will consist of all the malls
 */

public class UrbanDevAuthority {
private ArrayList<ShoppingComplex> lstMall = new ArrayList<ShoppingComplex>();

public void addMall(ShoppingComplex mall){
	lstMall.add(mall);
}
}
