package b05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SimpleTest {

	@Test
	void isEvenTrue() {
		Simple simple = new Simple();
		boolean result =simple.isEven(42);
		
		assertTrue(result);
	}
	
	@Test
	void isEvenFalse() {
		Simple simple = new Simple();
		boolean result =simple.isEven(-43);
		
		assertFalse(result);
	}
	
	@Test
	void isEvenZero() {
		Simple simple = new Simple();
		boolean result =simple.isEven(0);
		
		assertTrue(result);
	}

}
