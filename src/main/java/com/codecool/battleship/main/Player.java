package com.codecool.battleship.main;

import com.codecool.battleship.util.ShipType;
import com.codecool.battleship.util.SquareStatus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
	private int playerLives;
	private List<Ship> ships = new ArrayList<>();

	public List<Ship> getShips() {
		return ships;
	}

	public Player() {
		generateShips();
		countPlayerLives();
	}


	private void countPlayerLives() {
		this.playerLives = ships.size();
		}

	public void removeOneLive() {
		this.playerLives--;
	}

	public int getPlayerLives() {
		return this.playerLives;
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

	public boolean checkIfShipIsDestroyed() {
		for (Ship ship : ships) {
			int count = 0;
			for (Square square : ship.getShipLocations()) {
				if (square.status == SquareStatus.HIT)
					count++;
			}
			if (count == ship.getShipLocations().size()){
				for (Square square : ship.getShipLocations()){
					square.status = SquareStatus.DESTROYED;
				}
				return true;
			}
		}
		return false;
	}
}
