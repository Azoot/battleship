package com.codecool.battleship.main;

import com.codecool.battleship.util.ShipType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
	private List<Ship> ships = new ArrayList<>();

	public List<Ship> getShips() {
		return ships;
	}

	public Player() {
		generateShips();
		for (Ship ship : ships) {
			System.out.println(ship);
		}

	}

	private void generateShips() {
		List<ShipType> shipType = Arrays.asList(ShipType.values());

		for (int i = 0; i < shipType.size(); i++) {
			String shipName = shipType.get(i).toString();
			int shipQuantity = shipType.get(i).getShipQuantity();
			for (int j = 0; j < shipQuantity; j++) {
				Ship ship = new Ship();
				ship.setStatus(ShipType.valueOf(shipName));
				ships.add(ship);
			}
		}
	}
}
