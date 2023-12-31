package com.codecool.battleship.main;

import com.codecool.battleship.util.GameModes;
import com.codecool.battleship.util.MenuItem;
import com.codecool.battleship.util.PlacementModes;
import com.codecool.battleship.util.SquareStatus;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class Display {
	/**
	 * Creates list type <MenuItem> called menuItems then states the content of the list itself
	 */
	private List<MenuItem> menuItems = List.of(MenuItem.START, MenuItem.HIGH_SCORE, MenuItem.EXIT);
	private List<GameModes> gameModes = List.of(GameModes.SOLO, GameModes.TWO_PLAYERS);
	private List<PlacementModes> placementModes = List.of(PlacementModes.MANUAL, PlacementModes.RANDOM);

	/**
	 * Print board
	 *
	 * @param board <-- printed row by row
	 */
	public void printBoard(Square[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				System.out.print(StringUtils.center(String.valueOf(board[row][col]), 4));
			}
			System.out.println();
		}
	}

	public void printBoard(Square[][] board, Square[][] enemyBoard) {
		printColumnNumbers(board.length);
		System.out.print("\t");
		printColumnNumbers(enemyBoard.length);
		System.out.println();
		for (int row = 0; row < board.length; row++) {

			System.out.print(this.printRowLetters(row) + " ");
			for (int col = 0; col < board.length; col++) {

				System.out.print(StringUtils.center(String.valueOf(board[row][col]), 3));
			}
			System.out.print("\t" + (this.printRowLetters(row)) + " ");

			for (int col = 0; col < board.length; col++) {
				if (enemyBoard[row][col].status == SquareStatus.SHIP) {
					System.out.print(StringUtils.center(String.valueOf(SquareStatus.EMPTY.GetCharacter()), 3));
				} else {
					System.out.print(StringUtils.center(String.valueOf(enemyBoard[row][col]), 3));
				}
			}
			System.out.println();
		}
	}

	public void displayMenu() {
		System.out.println("Menu:");
		for (int i = 0; i < menuItems.size(); i++) {
			System.out.println(i + 1 + ". " + menuItems.get(i));
		}

	}

	public void displayGameModes() {
		System.out.println("Game Modes: ");
		for (int i = 0; i < gameModes.size(); i++) {
			System.out.println(i + 1 + ". " + gameModes.get(i));
		}
	}

	public void displayPlacementModes() {
		System.out.println("Placement Methods: ");
		for (int i = 0; i < placementModes.size(); i++) {
			System.out.println(i + 1 + ". " + placementModes.get(i));
		}
	}

	private char printRowLetters(int asciiVal) {
		return (char) (65 + asciiVal);
	}

	private void printColumnNumbers(int boardLength) {
		System.out.print("  ");
		for (int i = 0; i < boardLength; i++) {
			System.out.print(StringUtils.center(String.valueOf((i + 1)), 3));
			System.out.print("");
		}
	}

	/**
	 * not realy a ClearScreen, rewinds screen in Windows Terminal,
	 * does not work in IDE's terminal
	 */
	public void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public void printWinningMessage(String player) {
		System.out.println("Wygrał " + player);
	}

	public void printMenuList(String menuValue) {
		if (menuValue == "Menu") displayMenu();
		else if (menuValue == "Game") displayGameModes();
		else if (menuValue == "Placement") displayPlacementModes();
	}

	public void printMessage(String message) {
		System.out.println(message);
	}
}
