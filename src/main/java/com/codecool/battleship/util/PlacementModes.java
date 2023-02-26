package com.codecool.battleship.util;

import java.util.HashMap;
import java.util.Map;

public enum PlacementModes {
	RANDOM(1, "Place them your self(MASTER TACTICIAN MODE) !)"),
	MANUAL(2, "Just throw them at random YES! (Ship Pile up Mode !!)");

	private static final Map<Integer, PlacementModes> NUMBER = new HashMap<>();

	static {
		for (PlacementModes m : values()) {
			NUMBER.put(m.number, m);
		}
	}
	private final int number;
	private final String value;

	PlacementModes(int number, String value) {
		this.number = number;
		this.value = value;
	}
	public static PlacementModes valueOfNumber(int number){
		return NUMBER.get(number);
	}
	@Override
	public String toString() {
		return this.value;
	}
}
