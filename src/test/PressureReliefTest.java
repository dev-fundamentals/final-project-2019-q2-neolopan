package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PressureReliefTest {
	@Test
	void isOpen_returnFalse_WhenValveIsClosed() throws Exception {
		PressureReliefValve val= new  PressureReliefValve();
		boolean actual = val.isOpen();
		boolean expected = false;
		
		
		assertEquals(expected, actual);
	}
	@Test
	void isOpen_returnTrue_WhenValveIsOpened() throws Exception {
		PressureReliefValve val= new  PressureReliefValve();
		val.openValve();
		boolean actual = val.isOpen();
		boolean expected = true;
		
		
		assertEquals(expected, actual);
	}
	
	

}
