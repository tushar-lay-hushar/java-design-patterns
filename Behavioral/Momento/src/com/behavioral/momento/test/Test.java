package com.behavioral.momento.test;

import com.behavioral.momento.Document;
import com.behavioral.momento.SavedDocument;

public class Test {

	public static void main(String[] args) {
		
		Document doc = new Document("English", "abcd");
		
		System.out.println(doc);
		
		SavedDocument savedDoc = doc.saveDocument();
		
		doc.addContent("efghijk");
		
		System.out.println(doc);
		
		doc.restoreDocument(savedDoc);
		
		System.out.println(doc);
	}

}
