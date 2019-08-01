package b09;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class TabellaTest {

	@Test
	void addPlain() {

		Tabella tabella = new Tabella();
		tabella.add(7);
		tabella.add(5);
		ArrayList<Integer> actual = new ArrayList<Integer>( );

		assertEquals(actual, "(1,7,5)");
	}

}
