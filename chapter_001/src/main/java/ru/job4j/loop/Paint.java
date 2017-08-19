package ru.job4j.loop;

 /**
 * drawing a pyramid.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

 public class Paint {
	/**
	  * pyramid.
	  * @param h - height of the pyramid,
	  * @return returns "pyramid" (string with new line signs).
	  */
	public String pyramid(int h) {
        StringBuilder pyram = new StringBuilder();
        int width = 2 * h - 1;
//row
        for (int i = 1; i <= h; i++) {
//column
            for (int j = 1; j <= width; j++) {
                if ((j <= (h - i)) || (j >= (h + i))) {
                    pyram.append(" ");
                } else {
                    pyram.append("^");
                }
            }
            pyram.append(System.getProperty("line.separator"));
        }
		pyram.setLength((h + 1) * width - 1);
        return pyram.toString();
	}
}