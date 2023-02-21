package com.codecool.battleship.main;

import com.codecool.battleship.util.SquareStatus;

public class Square {
	/**
	 * at this point this function retrieves only square status from ENUM,
	 * does not do anything else or is used anywhere.
	 */
	public SquareStatus status;

	Square() {

	}

	public void setStatus(SquareStatus status)
	{
		this.status = status;
	}
}