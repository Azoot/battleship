package com.codecool.battleship.util;

public enum SquareStatus {
	EMPTY("\u1F600"),
	SHIP("s"),
	HIT("h"),
	MISSED("m");

	String value;

	private SquareStatus(String value)
	{
		this.value = value;
	}

	public String GetCharacter()
	{
		return this.value;
	}
}