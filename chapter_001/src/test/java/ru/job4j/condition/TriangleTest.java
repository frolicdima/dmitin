package ru.job4j.condition;

/**
 * Вычисление площади треугольника.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */
import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

     /**
	  * TriangleTest class.
      */

public class TriangleTest {
	/**
	  * @Test add
	  */
	 @Test
	public void whenExpectedAreaSupposedToBe2() {
    Point a = new Point(0, 0);
    Point b = new Point(0, 2);
    Point c = new Point(2, 0);
    Triangle triangle = new Triangle(a, b, c);
    double result = triangle.area();
    double expected = 2;
    assertThat(result, closeTo(expected, 0.1));
 }
}