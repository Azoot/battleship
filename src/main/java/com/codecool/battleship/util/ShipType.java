package com.codecool.battleship.util;

public enum ShipType {
	CARRIER(1),
	CRUISER(2),
	BATTLESHIP(3),
	SUBMARINE(4),
	DESTROYER(5);

	int value;

	private ShipType(int value) {
		this.value = value;
	}
	public int getSize() {
		return this.value;
	}
}



