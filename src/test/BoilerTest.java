package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoilerTest {

	@Test
	void test() {
		Boiler bo = new Boiler();
		bo.setState(BoilerState.empty);
		
		BoilerState expected = BoilerState.empty;
		State actual = bo.getState();
		
		assertEquals(expected, actual);
	}

}
