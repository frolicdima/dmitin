package ru.job4j.loop;

 /**
 * chess board.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

 public class Board {
	/**
	  * chess board.
	  * @param width - width of the board,
	  * @param height - hight of the board,
	  * @return returns board (string with new line signs).
	  */
	  public String paint(int width, int height) {
		  StringBuilder board = new StringBuilder();
		  for (int i = 1; i <= height; i++) {
			  for (int j = 1; j <= width; j++) {
				  if ((i + j) % 2 == 0) {
					  board.append("x");
				  } else {
					  board.append(" ");
				  }
				}
				board.append(System.getProperty("line.separator"));
			}
			return board.toString();
		}
}