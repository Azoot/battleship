package com.codecool.battleship.main;

import com.codecool.battleship.util.ShipType;

/**
 * at this point this function only retrieves size off shim with certain status/name from ENUM
 */
public class Ship {

		public ShipType shipSize;

		public Ship() {

		}

		public void setStatus(ShipType status){
			this.shipSize = status;
		}
	}
