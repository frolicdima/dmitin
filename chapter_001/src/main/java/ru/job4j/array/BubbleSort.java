package ru.job4j.array;

 /**
 * array sort.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class BubbleSort {
	/**
	  * array sort.
	  * @param array - input array of int type,
	  * @return returns sorted array.
	  */
	public int[] sort(int[] array) {
		for (int counter = 0; counter < array.length - 1; counter++) {
			for (int index = 0; index < array.length - 1; index++) {
				if (array[index] > array[index + 1]) {
					int temp = array[index];
					array[index] = array [index + 1];
					array[index + 1] = temp;
				}
			}
		}
		return array;
	}
}