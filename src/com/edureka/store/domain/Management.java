package com.edureka.store.domain;

public abstract class Management {
private String president;
private String director;
private int duration;




public Management(String president, String director, int duration) {
	super();
	this.president = president;
	this.director = director;
	calculateDuration(duration);
}
public String getPresident() {
	return president;
}
public void setPresident(String president) {
	this.president = president;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}


public int getDuration() {
	return duration;
}
public void setDuration(int duration) {
	this.duration = duration;
}
abstract void calculateDuration(int term);
}

