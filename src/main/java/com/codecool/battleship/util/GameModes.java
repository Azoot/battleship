package com.codecool.battleship.util;

import java.util.HashMap;
import java.util.Map;

public enum GameModes {
	SOLO(1, "Solo Mode"),
	TWO_PLAYERS(2, "Play with friend (does not have to be friend tho ;)");

	private static final Map<Integer, GameModes> NUMBER = new HashMap<>();

	static {
		for (GameModes m : values()) {
			NUMBER.put(m.number, m);
		}
	}
	private final int number;
	private final String value;

	GameModes(int number, String value) {
		this.number = number;
		this.value = value;
	}
	@Override
	public String toString() {
		return this.value;
	}
	public static GameModes valueOfNumber(int number){
		return NUMBER.get(number);
	}

}
