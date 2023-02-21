package com.codecool.battleship.main;

import com.codecool.battleship.util.ShipType;

public class Ship {
		public ShipType shipSize;

		public Ship() {

		}

		public void setStatus(ShipType status){
			this.shipSize = status;
		}
	}
