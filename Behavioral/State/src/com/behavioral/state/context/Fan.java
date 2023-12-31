package com.behavioral.state.context;

import com.behavioral.state.FanHighState;
import com.behavioral.state.FanLowState;
import com.behavioral.state.FanMedState;
import com.behavioral.state.FanOffState;
import com.behavioral.state.State;

public class Fan {
	
	private State fanOffState;
	private State fanLowState;
	private State fanMedState;
	private State fanHighState;
	
	private State currentState;

	public Fan() {
		super();
		this.fanOffState = new FanOffState(this);
		this.fanLowState = new FanLowState(this);
		this.fanMedState = new FanMedState(this);
		this.fanHighState = new FanHighState(this);
		
		this.currentState = new FanOffState(this);
	}

	public State getFanLowState() {
		return fanLowState;
	}
	
	public State getFanMedState() {
		return fanMedState;
	}
	
	public State getFanHighState() {
		return fanHighState;
	}
	
	public State getFanOffState() {
		return fanOffState;
	}

	public void setState(State state) {
		this.currentState = state;
	}
	
	public void pullChain() {
		currentState.handleRequest();
	}

	@Override
	public String toString() {
		return currentState.toString();
	}
	
	
}
