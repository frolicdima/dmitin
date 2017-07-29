package ru.job4j.condition;
 /**
 * Triangle.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Triangle {
	/** a point. */
  private Point a;
  	/** b point. */
  private Point b;
  	/** c point. */
  private Point c;
    /**
     *конструктор треугольника.
	 *@param a point a
	 *@param b point b
	 *@param c point c
	 */
  public Triangle(Point a, Point b, Point c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
    /** метод, который вычисляет площадь треугольника.
	*@return площадь
    */

   public double area() {
	   double areaasis;
	   areaasis = ((a.getX() - c.getX()) * (b.getY() - c.getY()) - (b.getX() - c.getX()) * (a.getY() - c.getY())) / 2;
       return areaasis < 0 ? -areaasis : areaasis;
}
}