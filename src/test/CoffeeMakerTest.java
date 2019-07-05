package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CoffeeMakerTest {
	@Test
	void amAbleToMake_returnsTrue_whenReqAreMet() throws Exception {
		Coffee coffee= new Coffee(250);
		CoffeeMaker maker=new CoffeeMaker();
		maker.fillFilter(coffee);
		maker.pourWater(1);
		maker.amIAbleToMakeCoffee();
		boolean expected = true;
		
		
		assertEquals(expected, false);
	}

}
