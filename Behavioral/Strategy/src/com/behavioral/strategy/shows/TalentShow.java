package com.behavioral.strategy.shows;

import com.behavioral.strategy.Performer;

public class TalentShow {
	
	private Performer performer;
	
	public void setPerformer(Performer performer) {
		this.performer = performer;
	}
	
	public void audition() {
		performer.perform();
	}

}
