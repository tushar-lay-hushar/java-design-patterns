package com.creational.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private static volatile Singleton instance = null;
	private static boolean isInstantiated = false;

	private Singleton() throws InstantiationException {
		if (isInstantiated)
			throw new InstantiationException("Class is singleton cant create multiple objects.");
		else {
			isInstantiated = true;
			System.out.println("Created Single Object.");
		}
	}

	public static Singleton getIntance() {
		try {
			if (instance == null) {
				synchronized (Singleton.class) {
					if(instance == null)

						instance = new Singleton();

				}
			}
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return instance;
	}
	
	public Object readResolve() {
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return instance;
	}

}
