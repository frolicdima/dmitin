package ru.job4j.array;

 /**
 * array turn.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class RotateArray {
	/**
	  * array rotate.
	  * @param array - input array of int type,
	  * @return returns turned array.
	  */
	public int[][] rotate(int[][] array) {
		int[][] newArray = new int[array.length][array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j >= 0; j--) {
                newArray[i][j] = array[j][i];
            }
        }
		return newArray;
	}
}