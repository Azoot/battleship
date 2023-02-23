package com.codecool.battleship.util;

import com.codecool.battleship.main.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class BoardFactory {
	/**
	 * function that have to be built on later
	 */

		IntStream.
	public static List<Square> randomPlacement(int gameBoardLength, Square[][] gameBoard, int shipSize) {
			IntStream.iterat
	// TODO REFACTOR EVERYTHING randomPlacement
		while (true) {
			List<Square> squares = new ArrayList<>();
			int row = new Random().nextInt(gameBoardLength);
			int col = new Random().nextInt(gameBoardLength);
			if (gameBoard[row][col].status != SquareStatus.EMPTY) continue;
			// check right
			try {
				for (int i = row; i < row + shipSize; i++) {
					if (gameBoard[row][i].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
					Square square = new Square(row, i);
					square.setStatus(SquareStatus.SHIP);
					squares.add(square);
				}
			}catch (ArrayIndexOutOfBoundsException e){
				squares.clear();
			}
			if (squares.size() == shipSize) return squares;
			//check left
			try {
				for (int i = row; i > row - shipSize; i--) {
					if (gameBoard[row][i].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
					Square square = new Square(row, i);
					square.setStatus(SquareStatus.SHIP);
					squares.add(square);
				}
			}catch (ArrayIndexOutOfBoundsException e){
				squares.clear();
			}
			if (squares.size() == shipSize) return squares;
			// check bottom
			try {
				for (int i = col; i < col + shipSize; i++) {
					if (gameBoard[i][col].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
					Square square = new Square(i, col);
					square.setStatus(SquareStatus.SHIP);
					squares.add(square);
				}
			}catch (ArrayIndexOutOfBoundsException e){
				squares.clear();
			}
			if (squares.size() == shipSize) return squares;
			try {
				for (int i = col; i > col - shipSize; i--) {
					if (gameBoard[i][col].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
					Square square = new Square(i, col);
					square.setStatus(SquareStatus.SHIP);
					squares.add(square);
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				squares.clear();
			}
			if (squares.size() == shipSize) return squares;
		}
	}


	public char[][] manualPlacement() {

		return new char[0][];
	}

}
