package test;

import java.util.Scanner;

public class main {

	public static void main(String[] args) throws InterruptedException {
		
		Scanner reader = new Scanner( System.in );
		int opcion =0;
		int cups=0;
		Coffee coffee= new Coffee(250);
		CoffeeMaker maker=new CoffeeMaker();
		maker.fillFilter(coffee);
		System.out.println(">>C O F F E E   M A K E R<<");
		while (opcion != 4) {
		System.out.println("Menu:");
		System.out.println("1. Fill cups of water");
		System.out.println("2. Brew coffee");
		System.out.println("3. Remove pot");
		System.out.println("4. Exit");
		
		 opcion = reader.nextInt();
		switch (opcion) {
		case (1):
			    System.out.println("Enter amount of cups of water");
				cups=reader.nextInt();
				maker.pourWater(cups);
		case (2):
			System.out.println("**************>>·.·<<**************");
				maker.brew(cups);
		case (3):
			maker.removePot();
		default:
			break;
		}
		}
	}

}
