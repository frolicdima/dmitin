package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * MaxTest class.
	  */

public class CounterTest {
	/**
	  * @Test counter.
	  */
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter cnt = new Counter();
		int result = cnt.add(1, 10);
		int expected = 30;
		assertThat(result, is(expected));
	}
}