package com.behavioral.iterator.list;

import com.behavioral.iterator.Iterator;
import com.behavioral.iterator.ListIterator;

public class ItemsList<E> implements List<E> {
	
	private E[] elements;

	public ItemsList(E[] elements) {
		super();
		this.elements = elements;
	}

	@Override
	public Iterator<E> iterator() {
		return new ListIterator<>(elements);
	}

}
