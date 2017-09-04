package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * SubstringSearchMy class.
	  */

public class SubstringSearchMyTest {
	/**
	  * @Test "contains" method.
	  */
	@Test
	public void whenOriginContainsSubThenTrue() {
		SubstringSearchMy first = new SubstringSearchMy();
		boolean result = first.contains("привет", "иве");
		boolean expected = true;
		assertThat(result, is(expected));
	}

	/**
	  * @Test "contains" method.
	  */
	@Test
	public void whenOriginContainsSubThenFalse() {
		SubstringSearchMy first = new SubstringSearchMy();
		boolean result = first.contains("привет", "ивеs");
		boolean expected = false;
		assertThat(result, is(expected));
	}
}