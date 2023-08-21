package com.creational.prototype.test;

import com.creational.prototype.Notes;
import com.creational.prototype.xerox.Xerox;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Notes englishNotes = Xerox.getNotes("English");
		System.out.println(englishNotes);
		
		englishNotes = Xerox.getNotes("English");
		System.out.println(englishNotes);
	}

}
