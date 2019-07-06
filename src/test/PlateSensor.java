package test;

public class PlateSensor extends Sensor{
	
	PlateSensor(Pot pot){
		super(pot);
	}
	
	public boolean isPotpresent() {
		return(getState() != PotState.warmerEmpty);
		
	}
}
