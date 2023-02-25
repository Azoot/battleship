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

	public String playerRound(int[] cords) {
		int row = cords[0];
		int col = cords[1];
		if (playersMove) {
			Square enemySquare = this.enemyBoard.getOcean()[row][col];
			if (enemySquare.status == SquareStatus.SHIP) {
				enemySquare.status = SquareStatus.HIT;
			} else if (enemySquare.status == SquareStatus.EMPTY) {
				enemySquare.status = SquareStatus.MISSED;
				playersMove = false;
				System.out.println("enemy round");
			}
			if (enemy.checkIfShipIsDestroyed())
				enemy.removeOneLive();
				if (playerIsAlive(enemy.getPlayerLives())) return "enemy";
		} else {
			Square playerSquare = this.board.getOcean()[row][col];
			if (playerSquare.status == SquareStatus.SHIP) {
				playerSquare.status = SquareStatus.HIT;
			} else if (playerSquare.status == SquareStatus.EMPTY) {
				playerSquare.status = SquareStatus.MISSED;
				playersMove = true;
				System.out.println("Player round");
			}
			if (player.checkIfShipIsDestroyed())
				player.removeOneLive();
			if (playerIsAlive(player.getPlayerLives())) return "player";
		}
		return null;
	}

	public boolean playerIsAlive(int lives) {
		return (lives == 0) ? true : false;
	}


	/**
	 * String winner = null;
	 * private setWinner(String winner);
	 * winner = winner
	 */


//	public gameIsRunning(){
//
//	}

}

