package com.codecool.battleship.main;


import com.codecool.battleship.util.MenuItem;

public class Battleship {
	private Display display = new Display();
	Input input = new Input();
	Game game = new Game();
	public void battleship() {
		while(true){
			this.display.clearScreen();
			this.display.displayMenu();
//			String playerInput = input.getPlayerInput();
//			MenuItem menuItem = MenuItem.valueOfNumber(Integer.parseInt(playerInput));
			MenuItem menuItem = MenuItem.START;
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
