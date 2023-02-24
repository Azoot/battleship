package com.codecool.battleship.main;

import com.codecool.battleship.util.SquareStatus;

public class Square {
	/**
	 * at this point this function retrieves only square status from ENUM,
	 * does not do anything else or is used anywhere.
	 */
	public SquareStatus status = SquareStatus.EMPTY;
	private int posX;
	private int posY;

	public Square(int posY, int posX, SquareStatus status) {
		this.posX = posX;
		this.posY = posY;
		this.status = status;

	}

	public void setStatus(SquareStatus status) {
		this.status = status;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosX() {
		return posX;
	}


	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getPosY() {
		return posY;
	}

	@Override
	public String toString() {
		return status.GetCharacter();
	}
}