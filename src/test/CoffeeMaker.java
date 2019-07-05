package test;


public class CoffeeMaker {
	Boiler boiler;
	Receptacle receptacle;
	Filter filter;
	Pot pot;
	IndicatorLight light;
	PlateSensor plateSensor;
	PlateHeater plateHeater;
	
	CoffeeMaker()
	{
		 boiler=new Boiler();
		 filter= new Filter();
		 receptacle=new Receptacle();
		 
		 pot = new Pot();
	}
	public void fillFilter(Coffee coffee) {
		// TODO Auto-generated method stub
		receptacle.openFilter();
		filter.fillCofee(coffee);
		receptacle.closeFilter();
		
		
	}
	public void pourWater(int i) {
		// TODO Auto-generated method stub
		
		boiler.fillWater(i);
	}
	public void brew(int i) throws Exception {
		// TODO Auto-generated method stub
		int cupsMade=0;
		//while (amIAbleToMakeCoffee() && cupsMade<i) {
		while ( cupsMade<i) {
			light.turnOn();
			cupsMade++;
			System.out.println("Preparing a cup of cofee...");
			Thread.sleep(1000);
			System.out.println("At the moment, the pot has "+cupsMade + " cup(s) of coffee.");
		}
		light.turnOff();
	}
	
	public void removePot() {
		// TODO Auto-generated method stub
		
	}
	public void amIAbleToMakeCoffee() {
		
			//pot is here...sensor will tell me
			if (plateSensor.isPotpresent()) {
				System.out.println("1");
				//boiler has water...boiler knows
				if (boiler.getState()==BoilerState.notEmpty) {
					System.out.println("2");
					//valve is closed...boiler knows
					if (boiler.isValveClosed()) {
						System.out.println("3");
			//filter has coffee...filter knows
						if (filter.getCoffeeAmount()>0) {
							System.out.println("4");
							//return true;
						}
						else
							System.out.println("No coffee in the filter");
					}
					else
						System.out.println("Valve is open, please close it");
				}
				else
					System.out.println("Boiler is empty");
			}
		
		else {
			System.out.println("Pot is not present");
		}
		//return false;
		}
		
		
	
}
