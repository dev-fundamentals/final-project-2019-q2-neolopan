package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class IndicatorLightTest {
	@Test
	void state_returnsFalse_whenItIsOff() {
		IndicatorLight light=new IndicatorLight();
		light.turnOff();
		boolean expected = false;
		boolean actual = light.getState();
		
		assertEquals(expected, actual);
	}	
	@Test
	void state_returnsTrue_whenItIsOn() {
		IndicatorLight light=new IndicatorLight();
		light.turnOn();
		boolean expected = true;
		boolean actual = light.getState();
		
		assertEquals(expected, actual);
	}	
}
