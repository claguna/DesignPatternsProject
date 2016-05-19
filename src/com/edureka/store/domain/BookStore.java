package com.edureka.store.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.edureka.store.iterator.Iterator;

/*
 * Represents the Bookstore Object
 */

public class BookStore extends Store {

	
	public BookStore(HashMap<String, Item> itmList) {
		super(StoreType.BOOK);
		// TODO Auto-generated constructor stub
		setItemList(itmList);
		setName("BookStore");
	}
	
	public Iterator iterator(){
		return new BookIterator();
	}

	@Override
	public void enter() {
		// TODO Auto-generated method stub

	}
	
	class BookIterator implements Iterator {

		int currentIndex = 0;
		private List<Item> bookList = null;
		
		BookIterator(){
			bookList = new ArrayList<Item>(getItmList().values());
		}
		
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			if (currentIndex >= bookList.size()) {
				return false;
			} else {
				return true;
			}
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return bookList.get(currentIndex++);
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
