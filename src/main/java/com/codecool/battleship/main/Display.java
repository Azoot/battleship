package com.codecool.battleship.main;

import com.codecool.battleship.util.MenuItem;

import java.util.List;

public class Display {
	/**
	 * Creates list type <MenuItem> called menuItems then states the content of the list itself
	 */
	private List<MenuItem> menuItems = List.of(MenuItem.START, MenuItem.HIGH_SCORE, MenuItem.EXIT);

	/**
	 * Print board
	 *
	 * @param board <-- printed row by row
	 */
	public void printBoard(Square[][] board) {
		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board.length; col++) {
				System.out.print(board[row][col] + " ");
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
				System.out.print(board[row][col] + " ");
			}
			System.out.print("\t" + (this.printRowLetters(row)) + " ");

			for (int col = 0; col < board.length; col++) {
				System.out.print(enemyBoard[row][col] + " ");
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

	private char printRowLetters(int asciiVal) {
		return (char) (65 + asciiVal);
	}

	private void printColumnNumbers(int boardLength) {
		System.out.print(" ");
		for (int i = 0; i < boardLength; i++) {
			System.out.print("  " + (i + 1));
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

	public void printWinningMessage(String player){
		System.out.println("Wygrał " + player);
	}


}
