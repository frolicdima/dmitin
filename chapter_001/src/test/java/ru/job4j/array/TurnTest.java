package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * BoardTest class.
	  */

public class TurnTest {
	/**
	  * @Test "back" method for Even Amount Of Elements.
	  */
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn even = new Turn();
        int[] result = even.back(new int[] {2, 6, 1, 4});
        int[] expected = new int[] {4, 1, 6, 2};
        assertThat(result, is(expected));
	}

	/**
	  * @Test "back" method for Odd Amount Of Elements.
	  */
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn even = new Turn();
        int[] result = even.back(new int[] {1, 2, 3, 4, 5});
        int[] expected = new int[] {5, 4, 3, 2, 1};
        assertThat(result, is(expected));
	}
}