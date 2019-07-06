package test;

public class IndicatorLight {
	private boolean state;
	IndicatorLight()
	{
		state=false;
	}
	
	void turnOn() {
		state=true;
		System.out.println("Indicator Light is turned On");
	}
	void turnOff() {
		state=false;
		System.out.println("Indicator Light is turned Off");
	}
	boolean getState() {
     return state;

	}
}
