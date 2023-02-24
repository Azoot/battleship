package com.codecool.battleship.main;

import com.codecool.battleship.util.SquareStatus;

public class Game {
	Board board = new Board(10);
	Board enemyBoard = new Board(10);
	Player player = new Player();
	Player enemy = new Player();

	Boolean playersMove = true;

	public Board getBoard() {
		return board;
	}

	public Board getEnemyBoard() {
		return enemyBoard;
	}

	/**
	 * Function Starting Game Rounds and logic
	 */
	public void start() {
		board.createGameBoard();
		enemyBoard.createGameBoard();
		for (Ship ship : player.getShips()) {
			board.placeShipOnBoard(ship);
		}
		for (Ship ship : enemy.getShips()) {
			enemyBoard.placeShipOnBoard(ship);
		}
		draw();


	}

	private void draw() {
		for (Ship ship : player.getShips()) {
			board.drawShipOnBoard(ship);
		}
		for (Ship ship : enemy.getShips()) {
			enemyBoard.drawShipOnBoard(ship);
		}
	}

	public void playerRound(int[] cords) {
		int row = cords[0];
		int col = cords[1];
		System.out.println(row +" " + col );
		if (playersMove) {
			System.out.println(this.enemyBoard.getOcean()[row][col].status);
			if (this.enemyBoard.getOcean()[row][col].status == SquareStatus.SHIP) {
				this.enemyBoard.getOcean()[row][col].status = SquareStatus.HIT;
				System.out.println(this.enemyBoard.getOcean()[row][col].status);
			}
		}
		draw();
	}

//	public gameIsRuning(){
//
//	}

}

