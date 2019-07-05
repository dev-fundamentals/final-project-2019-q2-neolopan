package test;

public class PressureReliefValve {
	private ValveState status;
	PressureReliefValve(){
		status=ValveState.closed;
	}

	public boolean isOpen() {
		
		return (status == ValveState.opened);
	}
	void openValve() {
		status=ValveState.opened;
	}

}
