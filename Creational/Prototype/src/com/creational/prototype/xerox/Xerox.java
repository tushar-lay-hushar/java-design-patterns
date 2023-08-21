package com.creational.prototype.xerox;

import java.util.HashMap;
import java.util.Map;

import com.creational.prototype.Chemistry;
import com.creational.prototype.EnglishNotes;
import com.creational.prototype.Notes;
import com.creational.prototype.PhysicsNotes;

public class Xerox {
	
	private static Map<String, Notes> prototypes = new HashMap<>();
	
	static {
		prototypes.put("english", new EnglishNotes());
		prototypes.put("physics", new PhysicsNotes());
		prototypes.put("chemistry", new Chemistry());
	}
	
	public static Notes getNotes(String subject) throws CloneNotSupportedException {
		return ((Notes) prototypes.get(subject.toLowerCase())).clone();
	}

}
