package com.codecool.battleship.main;


import com.codecool.battleship.util.MenuItem;

public class Battleship {
	private Display display = new Display();
	Input input = new Input();
	Game game = new Game();

	/**
	 * Main game starting Function executed by Main.java
	 * Shows first menu that gives player options to choose by typing numbers
	 */
	public void battleship() {
		while (true) {
			this.display.clearScreen();
			this.display.displayMenu();
//			String playerInput = input.getMenuInput();
//			MenuItem menuItem = MenuItem.valueOfNumber(Integer.parseInt(playerInput));
			MenuItem menuItem = MenuItem.START; // In case testing whole app comment this line(21) and uncomment line (19-20)

			if (menuItem == null) {
				System.out.println("Input number from 1 -2 ");
				continue;
			}
			switch (menuItem) {
				case START:
					System.out.println("Game started");
					game.start();
					while(true){
						try {
						display.printBoard(game.getBoard().getOcean(), game.getEnemyBoard().getOcean());
							int[] cords = input.getPlayerInput();
							game.playerRound(cords);
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}

					}
//					break;
				case HIGH_SCORE:
					System.out.println("There is no high score dummy");
					break;
				case EXIT:
					System.out.println("Exiting game");
					System.exit(0);
				default:
					System.out.println("1 - 2");
			}

		}
	}



}
