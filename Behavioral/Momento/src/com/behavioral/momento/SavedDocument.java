package com.behavioral.momento;

public class SavedDocument {
	
	private final String title;
	private final String content;
	
	public SavedDocument(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	
}
