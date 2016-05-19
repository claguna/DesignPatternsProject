package com.edureka.store.process;

import com.edureka.store.domain.Item;

public class ItemBuilder {
private Item item;


public ItemBuilder() {
	item = new Item();
}

public ItemBuilder name(String name) {
	
	item.setName(name);
	return this;
}

public ItemBuilder id(String id) {
	item.setId(id);
	return this;
}

public ItemBuilder storeId(String storeId) {
	item.setStoreId(storeId);
	return this;
}

public ItemBuilder price(Integer price) {
	item.setPrice(price);
	return this;
}

public Item build(){
	return item;
}

}
