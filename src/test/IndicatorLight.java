package test;

public class IndicatorLight {
	private boolean state;
	IndicatorLight()
	{
		state=false;
	}
	
	void turnOn() {
		state=true;
	}
	void turnOff() {
		state=false;
	}
	boolean getState() {
     return state;

	}
}
