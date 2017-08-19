package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

	/**
	  * PaintTest class.
	  */

public class PaintTest {
	/**
	  * @Test paint for height = 2.
	  */
	@Test
	public void whenPiramidWithHeightTwoThenStringWithThreeColsAndTwoRows() {
        Paint paint = new Paint();
        String result = paint.pyramid(2);
        String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
        assertThat(result, is(expected));
	}
	/**
	  * @Test paint for height = 3.
	  */
	@Test
	public void whenPiramidWithHeightThreeThenStringWithFiveColsAndThreeRows() {
        Paint paint = new Paint();
        String result = paint.pyramid(3);
        String expected = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"), System.getProperty("line.separator"));
        assertThat(result, is(expected));
	}
}