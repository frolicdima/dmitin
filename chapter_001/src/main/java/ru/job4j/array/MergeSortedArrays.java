package ru.job4j.array;

 /**
 * remove duplicates from array.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class MergeSortedArrays {
	/**
	  * remove duplicates from array.
	  * @param first - first sorted array of int type,
	  * @param second - second sorted array of int type,
	  * @return returns merged sorted array.
	  */
	public static int[] merge(int[] first, int[] second) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] merged = new int[first.length + second.length];
        while ((i < first.length) && (j < second.length)) {
            if (first[i] <= second[j]) {
                    merged[k] = first[i];
                    i++;
                    k++;
            } else if (first[i] > second[j]) {
                merged[k] = second[j];
                j++;
                k++;
            }
        }
        while (i < first.length) {
            merged[k] = first[i];
            i++;
            k++;
        }
        while (j < second.length) {
            merged[k] = second[j];
            j++;
            k++;
        }
        return merged;
    }
}