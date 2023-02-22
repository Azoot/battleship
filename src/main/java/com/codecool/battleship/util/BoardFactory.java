package com.codecool.battleship.util;

import com.codecool.battleship.main.Square;

import java.util.Random;

public class BoardFactory {
	/**
	 * function that have to be built on later
	 */
	public static Square[][] randomPlacement(int gameBoardLength, Square[][] gameBoard, SquareStatus ship){
		int shipCount = 2;
		for (int i = 0; i < shipCount; i++) {
			int x = new Random().nextInt(gameBoardLength);
			int y = new Random().nextInt(gameBoardLength);
				if (gameBoard[x][y].status != ship) {
					gameBoard[x][y].setStatus(ship);
				}
				else i -= 1;

			}
		return gameBoard;
	}

	public char[][] manualPlacement(){

		return new char[0][];
	}

}
