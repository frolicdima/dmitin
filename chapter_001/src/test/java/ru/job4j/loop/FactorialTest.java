package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * FactorialTest class.
	  */

public class FactorialTest {
	/**
	  * @Test calc for value 5.
	  */
	@Test
	public void whenCalc5Then120() {
		Factorial qwe = new Factorial();
		int result = qwe.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
	}

	/**
	  * @Test calc for value 0.
	  */
		@Test
	public void whenCalc0Then1() {
		Factorial qwe = new Factorial();
		int result = qwe.calc(0);
		int expected = 1;
		assertThat(result, is(expected));
	}
}