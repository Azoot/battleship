package com.codecool.battleship.main;

import com.codecool.battleship.util.ShipType;

import java.util.ArrayList;
import java.util.List;

/**
 * at this point this function only retrieves size off shim with certain status/name from ENUM
 */
public class Ship {

	private List<Square> shipLocations = new ArrayList<>();

		public ShipType shipSize;

		public Ship() {


		}

		public void setStatus(ShipType status){
			this.shipSize = status;
		}
	}
