package com.codecool.battleship.util;

import java.util.HashMap;
import java.util.Map;

public enum MenuItem {
	START(1,"Start Game."),
	HIGH_SCORE(2,"High Scores."),
	EXIT(3,"Exit Game.");



	private static final Map<Integer, MenuItem> NUMBER = new HashMap<>();

	/**
	 * this loop adds NUMBER value that is the number itself as a value that can be called out later on
	 * we can call that an "Enum" 'LABEL off ENUM item'
	 * START have two values that have LABEL Number and Value in that order
	 * START.number gives ('int' --> 1) and START.value gives ('String' -> "Start Game.")
	 */
	static {
		for (MenuItem m : values()) {
			NUMBER.put(m.number, m);
		}
	}
	private final String value;

	private final int number;


	MenuItem(int number, String value) {
		this.value = value;
		this.number = number;
	}

	/**
	 *
	 * @return a 'String' value of ENUM item
	 */
	@Override
	public String toString() {
		return this.value;
	}

	/**
	 * used to call
	 * @param number of ENUM item
	 * @return ENUM's item with LABEL "NUMBER"
	 */
	public static MenuItem valueOfNumber(int number){
		return NUMBER.get(number);
	}
}
