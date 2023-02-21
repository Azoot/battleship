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
		while(true){
			this.display.clearScreen();
			this.display.displayMenu();
//			String playerInput = input.getPlayerInput();
//			MenuItem menuItem = MenuItem.valueOfNumber(Integer.parseInt(playerInput));
			MenuItem menuItem = MenuItem.START; // I case testing whole app comment this line(21) and uncomment line 19 and 20
			if (menuItem == null){
				System.out.println("Input number from 1 -2 ");
				continue;
			}
			switch (menuItem){
				case START:
					System.out.println("Game started");
					game.start();
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
