package com.codecool.battleship.util;

import com.codecool.battleship.main.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoardFactory {
	/**
	 * function that have to be built on later
	 */


	public List<Square> randomPlacement(int gameBoardLength, Square[][] gameBoard, int shipSize) {
		// TODO REFACTOR EVERYTHING randomPlacement
		while (true) {
			List<Square> squares = new ArrayList<>();
			int row = new Random().nextInt(gameBoardLength);
			int col = new Random().nextInt(gameBoardLength);
			if (gameBoard[row][col].status != SquareStatus.EMPTY) continue;
			// check right
			try {
				int start, end, direction;
				for (int i = 0; i < 4; i++) {
					if (i == 0) {
						end = col;
						start = col - shipSize;
						direction = -1;
					} else if (i == 1) {
						start = row;
						end = row + shipSize;
						direction = 1;
					} else if (i == 2) {
						start = col;
						end = col + shipSize;
						direction = 1;
					} else {
						end = row;
						start = row - shipSize;
						direction = -1;
					}


					for (int number : this.getNumbers(start, end)) {

						if (i % 2 != 0) {
							System.out.println("pion");
							if (gameBoard[start][number].status != SquareStatus.EMPTY)
								throw new ArrayIndexOutOfBoundsException("");
							Square square = new Square(start, number);
							square.setStatus(SquareStatus.SHIP);
							squares.add(square);
						} else {
							System.out.println("poziom");
							if (gameBoard[number][start].status != SquareStatus.EMPTY)
								throw new ArrayIndexOutOfBoundsException("");
							Square square = new Square(number, start);
							square.setStatus(SquareStatus.SHIP);
							squares.add(square);
						}
						System.out.println(squares.size() + " size " + shipSize);
						if (squares.size() == shipSize) return squares;
					}
				}

//				for (int i = row; i < row + shipSize; i++) {
//					if (gameBoard[row][i].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
//					Square square = new Square(row, i);
//					square.setStatus(SquareStatus.SHIP);
//					squares.add(square);
//				}
			} catch (ArrayIndexOutOfBoundsException e) {
				squares.clear();
			}
//			//check left
//			try {
//				for (int i = row; i > row - shipSize; i--) {
//					if (gameBoard[row][i].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
//					Square square = new Square(row, i);
//					square.setStatus(SquareStatus.SHIP);
//					squares.add(square);
//				}
//			} catch (ArrayIndexOutOfBoundsException e) {
//				squares.clear();
//			}
//			if (squares.size() == shipSize) return squares;
//			// check bottom
//			try {
//				for (int i = col; i < col + shipSize; i++) {
//					if (gameBoard[i][col].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
//					Square square = new Square(i, col);
//					square.setStatus(SquareStatus.SHIP);
//					squares.add(square);
//				}
//			} catch (ArrayIndexOutOfBoundsException e) {
//				squares.clear();
//			}
//			if (squares.size() == shipSize) return squares;
//			try {
//				for (int i = col; i > col - shipSize; i--) {
//					if (gameBoard[i][col].status != SquareStatus.EMPTY) throw new ArrayIndexOutOfBoundsException("");
//					Square square = new Square(i, col);
//					square.setStatus(SquareStatus.SHIP);
//					squares.add(square);
//				}
//			} catch (ArrayIndexOutOfBoundsException e) {
//				squares.clear();
//			}
//			if (squares.size() == shipSize) return squares;
		}
	}


	public char[][] manualPlacement() {

		return new char[0][];
	}

	private List<Integer> getNumbers(int start, int limit) {
		return IntStream.iterate(start, i -> i + 1)
				.limit(limit)
				.boxed()
				.collect(Collectors.toList());
	}
}
