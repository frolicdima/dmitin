package ru.job4j.max;

/**
 * Максимум из двух чисел.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

 public class Max {
	/**
	 * вывод максимального из двух чисел с использованием тернаргого условия.
	 * @param first - first arg,
	 * @param second - second arg.
	 * @return max value
	 */
	 public int max(int first, int second) {
		 return (first >= second) ? first : second;
	 }

	 /**
	   * max of three numbers using "max" method.
	   * @param first - first arg,
	   * @param second - second arg,
	   * @param third - third arg.
	   * @return - max of (tempmax, third), maxofthree in fact.
	   */
	 public int maxofthree(int first, int second, int third) {
		int tempmax = max(first, second);
		return (max(tempmax, third));
	 }
 }