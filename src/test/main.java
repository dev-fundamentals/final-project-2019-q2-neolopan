package test;

public class main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Coffee coffee= new Coffee(250);
		CoffeeMaker maker=new CoffeeMaker();
		
		System.out.println("1. Fill cups of water");
		System.out.println("2. Brew coffee");
		System.out.println("3. Remove pot");
		System.out.println("4. Exit");
		
		maker.fillFilter(coffee);
		maker.pourWater(12);
		maker.brew(12);
		maker.removePot();
		
	}

}
