package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CoffeeTest {
	@Test
	void isOpen_returnsFalse_whenItIsClosed() {
		Coffee co = new Coffee(250);
		int expected = 250;
		int actual = co.getAmountOfCofee();
		
		assertEquals(expected, actual);
	}

}
