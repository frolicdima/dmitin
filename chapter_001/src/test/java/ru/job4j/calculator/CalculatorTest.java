package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

     /**
	  * CalculatorTest class.
      */
public class CalculatorTest {
	 /**
	  * @Test add
	  */
	 @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	  /**
	  * @Test substract
	  */
	 @Test
    public void whenSubstractOneMinusOneThenZero() {
        Calculator calc = new Calculator();
        calc.substract(1D, 1D);
        double result = calc.getResult();
        double expected = 0;
        assertThat(result, is(expected));
    }
	  /**
	  * @Test div
	  */
	 @Test
    public void whenDivFourDivideTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	  /**
	  * @Test multiple
	  */
	 @Test
    public void whenMultipleFourMultiplyTwoThenEight() {
        Calculator calc = new Calculator();
        calc.multiple(4D, 2D);
        double result = calc.getResult();
        double expected = 8D;
        assertThat(result, is(expected));
    }
}