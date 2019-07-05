package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PlateSensorTest {
	@Test
	void isPotPresent_ReturnsTrue_WhenPotIsPresent() {
		Pot po=new Pot();
		
		PlateSensor plate = new PlateSensor(po);
		boolean expected = true;
		boolean actual = plate.isPotpresent();
		
		assertEquals(expected, actual);
	}

}
