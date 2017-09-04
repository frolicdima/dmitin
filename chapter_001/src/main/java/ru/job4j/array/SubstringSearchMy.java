package ru.job4j.array;


 /**
 * substring search.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class SubstringSearchMy {

	/**
	  * check if "origin" substring contains "sub".
	  * @param origin - original string,
	  * @param sub - substring to be checked,
	  * @return returns turned array.
	  */
	static boolean contains(String origin, String sub) {
		//splitting String to array of Strings, each element represents one character
		String[] x = origin.split("");
		String[] y = sub.split("");
		//z - indicates that entire "sub" has been checked in cycle. If entire string has been checked, that means it contains in "origin"
		int z = 0;
		for (int i = 0; i < x.length; i++) {
			if (y[0].equals(x[i])) {
			z++;
			for (int a = 1; a < y.length; a++) {
				if (y[a].equals(x[i + a])) {
					z++;
				}
			}
		}
	}
	boolean result = (z == y.length);
	return result;
	}
}