package ru.job4j.condition;

 /**
 * Point.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */

public class Point {
   /** x. */
   private int x;
   /** y. */
   private int y;

   /**
     *зачем-то есть такая конструкция,пока не понял зачем она здесь.
	 *@param x x
	 *@param y y
	 */
   public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
  /** @return x */
  public int getX() {
      return this.x;
  }
  /** @return y */
  public int getY() {
     return this.y;
  }
  /** метод, который проверяет принадлежность точки.
    *@param a a
	*@param b b
	*@return yes no
    */
  public boolean is(int a, int b) {
	  return (y == (a * x + b));
}
}