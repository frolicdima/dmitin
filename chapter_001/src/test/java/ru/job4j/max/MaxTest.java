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
    public void whenMaxFirstLargerSecondThenFirst() { //первое число больше второго
    Max maximum = new Max(); //создаем объект maximum класса Max
    int result = maximum.max(100, 1); //в переменную result записываем наибольшее из двух заранее введенных руками чисел
	//умышленно делаем first больше second, чтобы пройти тест
    int expected = 100; //говорим, что должно быть 100
    assertThat(result, is(expected)); //сравниваем "что должно быть" и результат работы программы Max.java
    }

	/**
	  * @Test for maxofthree method
	  */
	 @Test
	public void whenMaxFirstIsTheLargestThenFirst() {
		Max maximum = new Max();
		int result = maximum.maxofthree(10, 5, 1);
		int expected = 10;
		assertThat(result, is(expected));
	}
}