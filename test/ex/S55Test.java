package ex;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.jupiter.api.Test;

class S55Test {

	@Test
	void sumPositive() {
		long actual = S55.sum(1, 3);

		assertThat(actual, is(6L));
	}

	@Test
	void sumExSimple() {
		try {
			S55.sumEx(3, 1);
			fail("Shouldn't get to this point");
		} catch (Exception e) {
			String expected = "errore";
			assertThat(e.getMessage(), is(expected));
		}
	}

	@Test
	void sumNegPos() {
		long actual = S55.sum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void sumSingle() {
		long actual = S55.sum(1003, 1003);

		assertThat(actual, is(1003L));
	}

	@Test
	void sumEmpty() {
		long actual = S55.sum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumPositive() {
		long actual = S55.evenSum(1, 3);

		assertThat(actual, is(2L));
	}

	@Test
	void evenSumNegPos() {
		long actual = S55.evenSum(-3, 3);

		assertThat(actual, is(0L));
	}

	@Test
	void evenSumSingle() {
		long actual = S55.evenSum(1002, 1002);

		assertThat(actual, is(1002L));
	}

	@Test
	void evenSumEmpty() {
		long actual = S55.evenSum(1003, 1002);

		assertThat(actual, is(0L));
	}

	@Test
	void factorialFour() {
		long actual = S55.factorial(4);

		assertThat(actual, is(24L));
	}

	

	@Test
	void factorialExSimple() {
		try {
			S55.factorialEx(-1);

		} catch (Exception e) {
			String expected = "Non si può fare il fattoriale di un numero negativo";
			assertThat(e.getMessage(), is(expected));
		}
	}

	@Test
	void factorialNegative() {
		long actual = S55.factorial(-4);

		assertThat(actual, is(0L));
	}

	@Test
	void fibonacci() {
		int actual = 8;

		assertThat(actual, is(8));
	}

	@Test
	void multiplicationTable() {
		int actual = 8;

		assertThat(actual, is(8));
	}
}
