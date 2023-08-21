package com.behavioral.iterator;

public interface Iterator<E> {
	
	boolean hasNext();
	
	E next();
	
	E currentItem();
	
	void reset();
	
}
