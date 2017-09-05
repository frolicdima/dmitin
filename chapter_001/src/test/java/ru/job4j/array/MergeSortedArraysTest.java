package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * MergeSortedArraysTest class.
	  */

public class MergeSortedArraysTest {
	/**
	  * @Test "merge" method.
	  */
	@Test
	public void whenMergeFirstAndSecondThenResult() {
		MergeSortedArrays array = new MergeSortedArrays();
        int[] result = array.merge(new int[] {0, 2, 4, 6, 8}, new int[] {1, 3, 5, 7, 9});
        int[] expected = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(expected));
	}
}