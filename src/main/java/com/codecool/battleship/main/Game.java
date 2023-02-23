package com.codecool.battleship.main;

public class Game {
	Board board = new Board(10);
	Player player = new Player();

	/**
	 * Function Starting Game Rounds and logic
	 */
	public void start() {
		board.createGameBoard();
		for (Ship ship : player.getShips()) {
			board.placeShipOnBoard(ship);
		}
		draw();
		Display.printBoard(board.getOcean());
		while (true) {

		}


	}

	private void draw() {
		for (Ship ship : player.getShips()) {
			board.drawShipOnBoard(ship);
		}
	}

//		public static void main(String[] args) {
//			Ship s2 = new Ship();
//			s2.setStatus(ShipType.SUBMARINE);
//			int size = s2.shipSize.getSize();
//			System.out.println(size);
//			Square s1 = new Square();
//			s1.setStatus(SquareStatus.EMPTY);
//			System.out.println(s1.status.GetCharacter());
//		}

}

