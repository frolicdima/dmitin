package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * BubbleSortTest class.
	  */

public class BubbleSortTest {
	/**
	  * @Test "sort" method for array of 10 elements.
	  */
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort unsorted = new BubbleSort();
        int[] result = unsorted.sort(new int[] {1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
        int[] expected = new int[] {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
        assertThat(result, is(expected));
	}
}