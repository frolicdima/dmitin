package ru.job4j.loop;

 /**
 * factorial calculation.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

 public class Factorial {
	/**
	  * factorial calculation.
	  * @param n - value for factorial calculation,,
	  * @return returns factorial.
	  */
	public int calc(int n) {
		int f = 1;
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
	return (f);
	}
}