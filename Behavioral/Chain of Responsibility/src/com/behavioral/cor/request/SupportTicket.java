package com.behavioral.cor.request;

public class SupportTicket {

	private int level;
	private String comments;
	private boolean isResolved;
	
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public boolean isResolved() {
		return isResolved;
	}
	public void setResolved(boolean isResolved) {
		this.isResolved = isResolved;
	}
	
}
