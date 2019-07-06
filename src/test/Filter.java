package test;

public class Filter {
	private final int FILTER_CAPACITY =250;
	private int amountOfCofee;
	
	Filter(){
		amountOfCofee=0;
	}
	public void fillCofee(Coffee c) {
		// TODO Auto-generated method stub
		if (c.getAmountOfCofee() + amountOfCofee <= FILTER_CAPACITY) {
			amountOfCofee += c.getAmountOfCofee();
			System.out.println("Coffee added");
		}
		else
			System.out.println("You can add only " +(FILTER_CAPACITY - amountOfCofee)+ " gr of coffee.");
	}
	public int getCoffeeAmount() {
		// TODO Auto-generated method stub
		return amountOfCofee;
	}

}
