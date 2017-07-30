package ru.job4j.loop;

 /**
 * sum counter.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Counter {
	/**
	  * The sum of even numbers on the interval.
	  * @param start - beginning of an interval,
	  * @param finish - end of an interval,
	  * @return returns sum.
	  */
	public int add(int start, int finish) {
		int sum = 0;
		if (start > finish) {
			System.out.println("wrong interval was set");
		}

		if ((start % 2) != 0) {
			start++;
		}

		for (int i = start; i <= finish; i += 2) {
				sum = sum + i;
			}
		return (sum);
	}
}