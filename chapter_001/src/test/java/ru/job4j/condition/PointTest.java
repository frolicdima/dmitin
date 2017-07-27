package ru.job4j.condition;

/**
 * Является ли точка решением функции.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

     /**
	  * PointTest class.
      */

public class PointTest {
	/**
	  * @Test add
	  */
	 @Test
    public void whenPointX1Y2ThenTrue() {
    Point tochka = new Point(1, 2);
    boolean result = tochka.is(1, 1);
    boolean expected = true;
    assertThat(result, is(expected));
    }
}