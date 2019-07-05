package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class ReceptacleTest {

		@Test
		void isOpen_returnsFalse_whenItIsClosed() {
			Receptacle rec = new Receptacle();
			
			boolean expected = false;
			boolean actual = rec.isOpen();
			
			assertEquals(expected, actual);
		}


}
