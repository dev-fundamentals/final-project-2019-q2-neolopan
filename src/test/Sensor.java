package test;

public abstract class Sensor {
	private State state;
	private Container container;

	Sensor(Container container){
		this.container = container;
	}
	
	public State getState() {
		// TODO Auto-generated method stub
		return container.getState();
	}

}
