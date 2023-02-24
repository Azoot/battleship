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
		while (true) {
			List<Square> squares = new ArrayList<>();
			int row = new Random().nextInt(gameBoardLength);
			int col = new Random().nextInt(gameBoardLength);
			if (gameBoard[row][col].status != SquareStatus.EMPTY) continue;
			try {
				int start, end;
				int count = 0;
				while (count < 4) {
					int i = new Random().nextInt(4);
					if (i == 0) {
						end = col;
						start = col - shipSize + 1;
					} else if (i == 1) {
						start = row;
						end = row + shipSize + 1;
					} else if (i == 2) {
						start = col;
						end = col + shipSize + 1;
					} else {
						end = row;
						start = row - shipSize + 1;
					}
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
