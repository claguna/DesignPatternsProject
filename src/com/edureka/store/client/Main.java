package com.edureka.store.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.edureka.store.domain.BookStore;
import com.edureka.store.domain.Customer;
import com.edureka.store.domain.Item;
import com.edureka.store.domain.Mall;
import com.edureka.store.domain.ShoeStore;
import com.edureka.store.domain.ShoppingCart;
import com.edureka.store.domain.ShoppingMallFactory;
import com.edureka.store.domain.Store;
import com.edureka.store.domain.StoreType;
import com.edureka.store.observer.NotifySalesObserver;
import com.edureka.store.process.StoreSingleton;
import com.edureka.store.reports.BillingReport;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Process Started");
		/*Mall m1 = new Mall();
		
		StoreSingleton storeSingle = StoreSingleton.getInstance();
		m1.setStoreList(storeSingle.getLstStore());*/
		
		Mall m1 = (Mall)ShoppingMallFactory.buildMall();
		
		Main mainTest = new Main();
		//mainTest.testIterator(m1);
		//mainTest.testShoppingCart(m1);
		mainTest.testObserver(m1);
		
		
		
/*		HashMap<String, Store> lstStore = m1.getStoreList();
		
		BookStore bookStore = (BookStore)lstStore.get(StoreType.BOOK.toString());
		
		System.out.println("Store Name :"+bookStore.getName() +" : Size :"+bookStore.sizeOfStore());
		
		ShoeStore shoeStore=(ShoeStore)lstStore.get(StoreType.SHOE.toString());
		
		System.out.println("Store Name :"+shoeStore.getName() +" : Size :"+shoeStore.sizeOfStore());*/
		
		/*Iterator<Store> itrStore = lstStore.iterator();
		while(itrStore.hasNext()){
			Store store = (Store)itrStore.next();
			System.out.println("Store Name :"+store.getName() +" : Size :"+store.sizeOfStore());
		}*/
		
		System.out.println("#############Testing Shopping Cart in MALL M1###############");
		
	/*	Customer customer = new Customer();
		customer.setShoppingCart(new ShoppingCart());
		
		ShoppingCart cart = customer.getShoppingCart();
		
		//Add Item from the book store
		
		
		cart.addItem(bookStore.getItemfromStore("2_bk1_mall1"));
		cart.addItem(shoeStore.getItemfromStore("1_shoe1_mall1"));
		
		
		//System.out.println("Testing Checkout : Sub Total :"+cart.getSubTotal());
		
		BillingReport billReport = new BillingReport();
		cart.accept(billReport);
		
		System.out.println("Testing Checkout : Visitor Total: "+billReport.getSubTotal());
		
		System.out.println("#############End Testing Shopping Cart in MALL M1###############");*/
		
		
		
				
		
		
		System.out.println("Process Completed");
	}
	
	public void testIterator(Mall m1){
		
		System.out.println("#############Testing Bookstore Iterator MALL M1###############");
		HashMap<String, Store> lstStore = m1.getStoreList();
		
		BookStore bookStore = (BookStore)lstStore.get(StoreType.BOOK.toString());
		com.edureka.store.iterator.Iterator itr = bookStore.iterator();
		while(itr.hasNext()){
			System.out.println("testIterator: BookList : bookName :"+((Item)itr.next()).getName());
		}
		
		System.out.println("#############Testing Bookstore Iterator End###############");
	}
	
	public void testShoppingCart(Mall m1){
		System.out.println("#############Testing Shopping Cart in MALL M1###############");
		
		
HashMap<String, Store> lstStore = m1.getStoreList();
		
		BookStore bookStore = (BookStore)lstStore.get(StoreType.BOOK.toString());
		
		System.out.println("Store Name :"+bookStore.getName() +" : Size :"+bookStore.sizeOfStore());
		
		ShoeStore shoeStore=(ShoeStore)lstStore.get(StoreType.SHOE.toString());
		
		System.out.println("Store Name :"+shoeStore.getName() +" : Size :"+shoeStore.sizeOfStore());
		
		Customer customer = new Customer("test");
		customer.setShoppingCart(new ShoppingCart());
		
		ShoppingCart cart = customer.getShoppingCart();
		
		//Add Item from the book store
		
		
		cart.addItem(bookStore.getItemfromStore("2_bk1_mall1"));
		cart.addItem(shoeStore.getItemfromStore("1_shoe1_mall1"));
		
		
		//System.out.println("Testing Checkout : Sub Total :"+cart.getSubTotal());
		
		BillingReport billReport = new BillingReport();
		cart.accept(billReport);
		
		System.out.println("Testing Checkout : Visitor Total: "+billReport.getSubTotal());
		
		System.out.println("#############End Testing Shopping Cart in MALL M1###############");
		
		
		
				
		
		
		System.out.println("Process Completed");		
	}
	
	public void testObserver(Mall m1){
		
		Customer customer1 = new Customer("customer1");
		Customer customer2 = new Customer("customer2");
		
		System.out.println("testObserver : Mall store timings :"+m1.getStoreTimings());
		
		m1.addObserver(customer1);
		m1.addObserver(customer2);
		
		m1.setSales(true);
		
	}

}
