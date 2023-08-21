package com.behavioral.iterator;

public class ListIterator<E> implements Iterator<E> {
	
	private E[] elements;
	private int postion;

	public ListIterator(E[] elements) {
		super();
		this.elements = elements;
		this.postion = 0;
	}

	@Override
	public boolean hasNext() {
		return postion >= elements.length ? false : true;
	}

	@Override
	public E next() {
		return elements[postion++];
	}

	@Override
	public E currentItem() {
		return elements[postion];
	}

	@Override
	public void reset() {
		this.postion = 0;
	}

}
