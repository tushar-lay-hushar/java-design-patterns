package com.creational.prototype;

public interface Notes extends Cloneable {
	
	public Notes clone() throws CloneNotSupportedException;
	public void readNotes();
}
