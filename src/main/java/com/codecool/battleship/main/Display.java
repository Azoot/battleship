package com.codecool.battleship.main;

import com.codecool.battleship.util.MenuItem;

import java.util.List;
public class Display {
	private List<MenuItem> menuItems = List.of(MenuItem.START, MenuItem.EXIT);

	public void displayMenu(){
		System.out.println("Menu:");
		for (int i = 0; i < menuItems.size(); i++){
			System.out.println(i+1 + ". " + menuItems.get(i));
		}

	}

	public void clearScreen() {
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	public static void printBoard(char[][] board){
		for (int row = 0; row < board.length; row++ ){
			for (int col = 0; col < board.length; col++){
				System.out.print(board[row][col]+ " ");
			}
				System.out.println();
		}
	}


}
