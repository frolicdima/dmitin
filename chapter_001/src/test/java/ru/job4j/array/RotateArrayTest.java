package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * RotateArrayTest class.
	  */

public class RotateArrayTest {
	/**
	  * @Test "rotate" method for 2x2 array.
	  */
	@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray array = new RotateArray();
        int[][] result = array.rotate(new int[][] {{1, 2}, {1, 2}});
        int[][] expected = new int[][] {{1, 1}, {2, 2}};
        assertThat(result, is(expected));
	}

	/**
	  * @Test "rotate" method for 2x2 array.
	  */
	@Test
	public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray array = new RotateArray();
        int[][] result = array.rotate(new int[][] {{1, 2, 3}, {1, 2, 3}, {1, 2, 3}});
        int[][] expected = new int[][] {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        assertThat(result, is(expected));
	}
}