package ru.job4j.calculator;

/**
 * Calculator.
 *
 * @author Dmitrii Mitin (ppdnk@mail.ru)
 * @version $Id$
 * @since 0.1
 */
public class Calculator {
	/** Результат арифметической операции.*/
private double result;

	/**
	 * add.
	 * @param first - first arg,
	 * @param second - second arg.
	 */
public void add(double first, double second) {
	this.result = first + second;
}

	/**
	 * substract.
	 * @param first - first arg,
	 * @param second - second arg.
	 */
public void substract(double first, double second) {
	this.result = first - second;
}

	/**
	 * div.
	 * @param first - first arg,
	 * @param second - second arg.
	 */
public void div(double first, double second) {
	this.result = first / second;
}

	/**
	 * multiple.
	 * @param first - first arg,
	 * @param second - second arg.
	 */
public void multiple(double first, double second) {
	this.result = first * second;
}

	/**
	 * getResult.
	 * @return result.
	 */
public double getResult() {
return this.result;
}
}