package ru.job4j.array;

import java.util.Arrays;

 /**
 * remove duplicates from array.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class ArrayDuplicate {
	/**
	  * remove duplicates from array.
	  * @param array - input array of int type,
	  * @return returns turned array.
	  */
	public String[] remove(String[] array) {
		int newLength = array.length;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 1; j < array.length - 1; j++) {
				if (array[i] == array[j]) {
					for (int k = j; k < array.length - 1; k++) {
                        array[k] = array[k + 1];
                    }
                    newLength--;
                    array = Arrays.copyOf(array, newLength);
				}
			}
		}
		return array;
	}
}