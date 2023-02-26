package com.codecool.battleship.util;

import com.codecool.battleship.main.Square;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoardFactory {
	private int start;
	private int end;

	/**
	 * function that have to be built on later
	 */


	public List<Square> randomPlacement(int gameBoardLength, Square[][] gameBoard, int shipSize) {
		while (true) {
			List<Square> squares = new ArrayList<>();
			int row = new Random().nextInt(gameBoardLength);
			int col = new Random().nextInt(gameBoardLength);
			if (gameBoard[row][col].status != SquareStatus.EMPTY) continue;
			try {
				int count = 0;
				while (count < 4) {
					int i = iterateDirections(col, row, shipSize, new Random().nextInt(4));
					for (int number : this.getNumbers(start, end)) {
						int rowNumber = row;
						int colNumber = number;

						if (i % 2 != 0) {
							rowNumber = number;
							colNumber = col;
						}
						if (gameBoard[rowNumber][colNumber].status != SquareStatus.EMPTY) {
							throw new ArrayIndexOutOfBoundsException("");
						}
						squares.add(new Square(rowNumber, colNumber, SquareStatus.SHIP));

						if (squares.size() == shipSize) return squares;
					}
					count++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				squares.clear();
			}
		}
	}

	// TODO przypisuje randomowe pozycje statkom pomimo manualnego podania pozycji/ Memory leak przy statkach dluzszych niz 1
	public List<List<Square>> manualPlacement(int[] cords, Square[][] gameBoard, int shipSize) {
		List<List<Square>> listOfSquares = new ArrayList<>();
		int row = cords[0];
		int col = cords[1];

		while (true) {
			List<Square> squares = new ArrayList<>();
			try {
				if (gameBoard[row][col].status != SquareStatus.EMPTY) break;
				int count = 0;
				while (count < 4) {
					int i = iterateDirections(col, row, shipSize, count);
					for (int number : this.getNumbers(start, end)) {
						int rowNumber = row;
						int colNumber = number;

						if (i % 2 != 0) {
							rowNumber = number;
							colNumber = col;
						}
						if (gameBoard[rowNumber][colNumber].status != SquareStatus.EMPTY) {
							throw new ArrayIndexOutOfBoundsException("");
						}
						squares.add(new Square(rowNumber, colNumber, SquareStatus.SHIP));
//						System.out.println(squares);

						if (squares.size() == shipSize & shipSize > 1) {
							listOfSquares.add(squares);
//							System.out.println(listOfSquares);
						}
						else if (shipSize == 1) {
							squares.add(new Square(rowNumber, colNumber, SquareStatus.SHIP));
							break;
						}
					}
//					System.out.println(shipSize);
					count++;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				squares.clear();
			}
			if (shipSize == 1) break;
		}

		return listOfSquares;
	}

	private int iterateDirections(int col, int row, int shipSize, int i) {
		if (i == 0) {
			this.end = col;
			this.start = col - shipSize + 1;
		} else if (i == 1) {
			this.start = row;
			this.end = row + shipSize + 1;
		} else if (i == 2) {
			this.start = col;
			this.end = col + shipSize + 1;
		} else {
			this.end = row;
			this.start = row - shipSize + 1;
		}
		return i;
	}

	private List<Integer> getNumbers(int start, int limit) {
		return IntStream.iterate(start, i -> i + 1)
				.limit(limit)
				.boxed()
				.collect(Collectors.toList());
	}
}
