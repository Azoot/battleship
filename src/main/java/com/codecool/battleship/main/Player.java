package com.codecool.battleship.main;

import com.codecool.battleship.util.ShipType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
	private List<Ship> ships = new ArrayList<Ship>();
	private List<ShipType> shipType = Arrays.asList(ShipType.values());

	public Player() {
		for (ShipType ship : shipType) {
			System.out.println(ship.getShipQuantity(1));
		}

	}
}
