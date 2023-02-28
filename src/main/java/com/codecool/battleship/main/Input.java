package com.codecool.battleship.main;

import java.util.Scanner;

public class Input {

	private Scanner scanner = new Scanner(System.in);

	/**
	 * This whole file content is just temporary
	 * everything to refactor according to app growth
	 *
	 * @return
	 */
	public String getMenuInput() {
		String playerInput = scanner.nextLine();

		return playerInput;
	}

	public int[] getPlayerInput() throws Exception {
		String playerInput = scanner.nextLine().toUpperCase();
		if (playerInput.length() < 2)
			throw new Exception("Input should contain letter and number eg. 'C1'");
		int x = playerInput.charAt(0);
		int y = Integer.parseInt(playerInput.substring(1));
		return new int[]{x % 65, y-1};
	}

}
