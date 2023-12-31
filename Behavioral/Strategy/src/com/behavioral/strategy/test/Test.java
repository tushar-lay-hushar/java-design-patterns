package com.behavioral.strategy.test;

import com.behavioral.strategy.Dancer;
import com.behavioral.strategy.Performer;
import com.behavioral.strategy.Singer;
import com.behavioral.strategy.shows.TalentShow;

public class Test {

	public static void main(String[] args) {
		
		TalentShow show = new TalentShow();
		
		show.setPerformer(new Dancer());
		show.audition();
		
		show.setPerformer(new Singer());
		show.audition();
		
		show.setPerformer(new Performer() {
			
			@Override
			public void perform() {
				System.out.println("I am a Juggler, I will Juggle things...");
			}
		});
		show.audition();

	}

}
