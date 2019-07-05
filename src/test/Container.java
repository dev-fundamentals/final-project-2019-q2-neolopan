package test;

public class Container {
	protected final int CAPACITY_CUPS=12;
	protected int currentQty;
	private State state;

	public State getState() {
		return state;
	}
	protected void setState(State state){
		this.state = state;
	}
}
