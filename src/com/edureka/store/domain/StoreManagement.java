package com.edureka.store.domain;

public class StoreManagement extends Management {

	@Override
	void calculateDuration(int term) {
		// TODO Auto-generated method stub
		setDuration(term*2);
	}

	public StoreManagement(String president, String director, int duration) {
		super(president, director, duration);
		// TODO Auto-generated constructor stub
	}

	

}
