package com.codecool.battleship.main;

import java.util.Scanner;

public class Input {

	private Scanner scanner = new Scanner(System.in);

	public String getPlayerInput(){
		String playerInput = scanner.nextLine();

		return playerInput;
	}
}
