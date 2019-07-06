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
		 light = new IndicatorLight();
		 plateSensor = new PlateSensor(pot);
		 plateHeater = new PlateHeater();
		
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
	public void brew(int i) throws InterruptedException{
		// TODO Auto-generated method stub
		int cupsMade=0;
		light.turnOn();
		while (amIAbleToMakeCoffee() && cupsMade<i) {
			cupsMade++;
			System.out.println("Preparing a cup of cofee...");
			Thread.sleep(1000);
			System.out.println("At the moment, the pot has "+cupsMade + " cup(s) of coffee.");
		}
		light.turnOff();
	}
	
	public void removePot() {
		pot.PotIsRemoved();
		System.out.println("Pot has been removed... ");
		
	}
	public void putPot() {
		pot.PotIsAllocated();
		System.out.println("Pot has been allocated... ");
		
	}
	public boolean amIAbleToMakeCoffee() {
		
			//pot is here...sensor will tell me
			if (plateSensor.isPotpresent()) {
			
				//boiler has water...boiler knows
				if (boiler.getState()==BoilerState.notEmpty) {
					
					//valve is closed...boiler knows
					if (!boiler.isValveOpened()) {
						
						//filter has coffee...filter knows
						if (filter.getCoffeeAmount()>0) {
							
							return true;
						}
						else
							System.out.println("Sorry, there is no coffee in the filter");
					}
					else
						System.out.println("Sorry, the valve is open, please close it");
				}
				else
					System.out.println("Sorry, the Boiler is empty. Please fill water.");
			}
		
		else {
			System.out.println("Sorry, the Pot is not present. Please allocate it");
		}
		return false;
		}
		
		
	
}
