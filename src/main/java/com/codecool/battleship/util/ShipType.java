package com.codecool.battleship.util;

import java.util.HashMap;
import java.util.Map;

public enum ShipType {
	CARRIER(1, 2),
	CRUISER(2, 2),
	BATTLESHIP(3, 2),
	SUBMARINE(4, 1),
	DESTROYER(5, 1);

	int shipSize, shipQuantity;
	private static final Map<Integer, ShipType> QUANTITY = new HashMap<>();

	static {
		for (ShipType e : values()){
			QUANTITY.put(e.shipQuantity, e);
		}
	}

	private ShipType(int shipSize, int shipQuantity) {
		this.shipSize = shipSize;
		this.shipQuantity = shipQuantity;
	}
	public int getSize() {
		return this.shipSize;
	}

	public ShipType getShipQuantity(int shipQuantity) {
		return ShipType.QUANTITY.get(shipQuantity);
	}
}



