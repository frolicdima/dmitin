package ru.job4j.max;

/**
 * Максимум из двух чисел.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

     /**
	  * MaxTest class.
      */

public class MaxTest {
	/**
	  * @Test add
	  */
	 @Test
    public void whenMaxFirstLargerSecondThenFirst() {
    Max maximum = new Max();
    maximum.max(2i, 1i);
    int result = maximum.max();
    int expected = 2i;
    assertThat(result, is(expected));
    }
}