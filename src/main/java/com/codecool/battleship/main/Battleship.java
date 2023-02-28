package com.codecool.battleship.main;


import com.codecool.battleship.util.GameModes;
import com.codecool.battleship.util.MenuItem;
import com.codecool.battleship.util.PlacementModes;

import static com.codecool.battleship.util.PlacementModes.MANUAL;
import static com.codecool.battleship.util.PlacementModes.RANDOM;

public class Battleship {
	Input input = new Input();
	Game game = new Game();
	private Display display = new Display();

	/**
	 * Main game starting Function executed by Main.java
	 * Shows first menu that gives player options to choose by typing numbers
	 */
	public void battleship() {
		while (true) {
			this.display.clearScreen();
			this.display.displayMenu();
			String playerInput = input.getMenuInput();
			MenuItem menuItem = MenuItem.valueOfNumber(Integer.parseInt(playerInput));
//			MenuItem menuItem = MenuItem.START; // In case testing whole app switch comment on  this line(21) and line (19-20)

			if (menuItem == null) {
				display.printMenuList("Menu");
				continue;
			}
			switch (menuItem) {
				case START:
					display.printMessage("Game initialization started.");
					display.printMenuList("Game");
					playerInput = input.getMenuInput();
					GameModes gameModes = GameModes.valueOfNumber(Integer.parseInt(playerInput));
					display.printMenuList("Placement");
					playerInput = input.getMenuInput();
					System.out.println(playerInput);
					PlacementModes placementMethod = PlacementModes.valueOfNumber(Integer.parseInt(playerInput));
					if (placementMethod == MANUAL) {
						game.createEmptyBoards();
						try {
							int i = 0;
							while (true) {
								display.printBoard(game.getBoard().getOcean(), game.getEnemyBoard().getOcean());
								int[] cords = input.getPlayerInput();
								game.startGameManualPlacement(cords, i++);
							}
						} catch (Exception e) {
							System.out.println(e.getMessage());
						}
					} else if (placementMethod == RANDOM) {
						game.start();
						while (true) {
							try {
								if (game.getPlayersMove())
									display.printBoard(game.getBoard().getOcean(), game.getEnemyBoard().getOcean());
								else
									display.printBoard(game.getEnemyBoard().getOcean(), game.getBoard().getOcean());
								int[] cords = input.getPlayerInput();
								String winner = game.playerRound(cords);
								if (winner == "enemy") {
									display.printWinningMessage("Player 1");
									break;
								} else if (winner == "player") {
									display.printWinningMessage("Player 2");
									break;
								}

							} catch (Exception e) {
								System.out.println(e.getMessage());
							}

						}
					}
					break;
				case HIGH_SCORE:
					display.printMessage("There is no high score dummy");
					break;
				case EXIT:
					display.printMessage("Exiting game");
					System.exit(0);
				default:
					System.out.println("1 - 2");
			}

		}
	}


}
