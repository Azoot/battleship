package com.codecool.battleship.main;
import java.util.Arrays;

public class Board {
	Square square = new Square(); // TODO Square [][] ??
	char water = '~';

	public char[][] createGameBoard(int gameBoardLength, char water){
	char[][]gameBoard = new char[gameBoardLength][gameBoardLength];
	for (char[] row: gameBoard) {
		Arrays.fill(row, water);
	}
		return gameBoard;
	}
}
