package com.codecool.battleship.main;

import com.codecool.battleship.util.BoardFactory;

public class Board {
	Square[][] ocean = new Square[0][]; // TODO Square [][] ??

	private int boardSize;

	public Board(int boardSize) {
		this.boardSize = boardSize;
	}

	public Square[][] getOcean() {
		return ocean;
	}

	/**
	 * creates game Board with only Water.
	 *
	 * @return
	 */
	public void createGameBoard() {
		Square[][] gameBoard = new Square[boardSize][boardSize];
		for (int i = 0; i < boardSize; i++) {
			for (int j = 0; j < boardSize; j++) {
				gameBoard[i][j] = new Square(j, i);
			}
		}
		ocean = gameBoard;
	}

	public void placeShipOnBoard(Ship ship) {
		ship.setSquares(BoardFactory.randomPlacement(boardSize, ocean, ship.shipType.getSize()));
		drawShipOnBoard(ship);
	}

	public void drawShipOnBoard(Ship ship){
		for (Square square : ship.getShipLocations()){
			ocean[square.getPosY()][square.getPosX()] =  square;

		}
	}

}