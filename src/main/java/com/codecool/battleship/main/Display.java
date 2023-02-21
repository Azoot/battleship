package com.codecool.battleship.main;

import com.codecool.battleship.util.MenuItem;
import java.util.List;

public class Display {
	/**
	 *Creates list type <MenuItem> called menuItems then states the content of the list itself
	 */
	private List<MenuItem> menuItems = List.of(MenuItem.START, MenuItem.EXIT);

	public void displayMenu(){
		System.out.println("Menu:");
		for (int i = 0; i < menuItems.size(); i++){
			System.out.println(i+1 + ". " + menuItems.get(i));
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

	/**
	 * Print board
	 * @param board <-- printed row by row
	 */
	public static void printBoard(char[][] board){
		for (int row = 0; row < board.length; row++ ){
			for (int col = 0; col < board.length; col++){
				System.out.print(board[row][col]+ " ");
			}
				System.out.println();
		}
	}


}
