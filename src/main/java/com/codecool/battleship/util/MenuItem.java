package com.codecool.battleship.util;

import java.util.HashMap;
import java.util.Map;

public enum MenuItem {
	START(1,"Start Game."),
	EXIT(2,"Exit Game.");


	private static final Map<Integer, MenuItem> NUMBER = new HashMap<>();
	static {
		for (MenuItem m : values()) {
			NUMBER.put(m.number, m);
		}
	}
	private String value;

	private int number;


	MenuItem(int number, String value) {
		this.value = value;
		this.number = number;
	}

	@Override
	public String toString() {
		return this.value;
	}

	public static MenuItem valueOfNumber(int number){
		System.out.println(number);
		return NUMBER.get(number);
	}
}
