package com.codecool.battleship.main;

import com.codecool.battleship.util.BoardFactory;
import com.codecool.battleship.util.SquareStatus;

public class Board {
	Square[][] ocean = new Square[0][]; // TODO Square [][] ??

	/**
	 * creates game Board with only Water.
	 * @param gameBoardLength
	 * @return
	 */
	public Square[][] createGameBoard(int gameBoardLength){
	Square[][]gameBoard = new Square[gameBoardLength][gameBoardLength];
	for (int i = 0; i < gameBoardLength; i++) {
		for (int j = 0; j < gameBoardLength; j++) {
			gameBoard[i][j] = new Square();
		}

	}
	Player player = new Player();
		gameBoard = BoardFactory.randomPlacement(gameBoardLength, gameBoard, SquareStatus.SHIP);

		return gameBoard;
	}
}
