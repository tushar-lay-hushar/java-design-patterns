package com.behavioral.momento;

public class Document {
	
	private String title;
	private String content;
	
	public Document(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}
	
	public SavedDocument saveDocument() {
		SavedDocument savedDocument = new SavedDocument(this.title, this.content);
		return savedDocument;
	}
	
	public void restoreDocument(SavedDocument savedDocument) {
		this.content = savedDocument.getContent();
		this.title = savedDocument.getTitle();
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getContent() {
		return content;
	}
	public void addContent(String content) {
		this.content += content;
	}

	@Override
	public String toString() {
		return "Document [title=" + title + ", content=" + content + "]";
	}
	
}
