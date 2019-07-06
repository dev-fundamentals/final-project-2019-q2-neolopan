package test;

public class Boiler extends Container {
	PressureReliefValve valve;
	DeliveryPipe pipe;
	BoilerState state;

	Boiler() {

		currentQty = 0;
		setState(BoilerState.empty);
		valve = new PressureReliefValve();
		pipe = new DeliveryPipe();
	}

	void fillWater(int cantCups) {

		if (currentQty + cantCups <= CAPACITY_CUPS) {

			for (int i = 1; i <= cantCups; i++) {

				System.out.println("Boiler has " + (currentQty + 1) + " cup(s) of water");
				currentQty = currentQty + 1;
			}
			if (currentQty < 0) {
				setState(BoilerState.empty);
				currentQty = 0;
			}
		}

		else {
			System.out.println("You can add up to " + (CAPACITY_CUPS - currentQty) + " more cups");
		}
		if (currentQty > 0) {
			setState(BoilerState.notEmpty);
		}
	}

	public boolean isValveOpened() {

		return valve.isOpen();
	}
}
