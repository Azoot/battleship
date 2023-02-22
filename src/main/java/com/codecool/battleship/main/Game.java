package com.codecool.battleship.main;

public class Game {
	Board board = new Board();
	Player player = new Player();

	/**
	 * Function Starting Game Rounds and logic
	 */
	public void start(){
		Square[][] gameBoard = board.createGameBoard(10);
		Display.printBoard(gameBoard);
		while (true){

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

