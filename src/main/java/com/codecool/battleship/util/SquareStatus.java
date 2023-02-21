package com.codecool.battleship.util;

public enum SquareStatus {
	EMPTY("\u1F600"), // test unicode return
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
/**
 * FOR TESTING PURPOSES CODE THAT RUNS WHAT HAPPENS IN HERE COPY TO NEW FILE
 * AND RUN THE FILE THAT THE CODE IS IN
 * the same code is split between classes in this app
 */
//
//enum SquareStatus {
//	EMPTY("\u1F600");
//
//	String value;
//
//	private SquareStatus(String value)
//	{
//		this.value = value;
//	}
//
//	public String GetCharacter()
//	{
//		return this.value;
//	}
//
//}
//class Square {
//	public SquareStatus status;
//
//	Square() {
//
//	}
//
//	public void setStatus(SquareStatus status)
//	{
//		this.status = status;
//	}
//
//	public class Main
//	{
//		public static void main(String[] args) {
//			Square s1 = new Square();
//			s1.setStatus(SquareStatus.EMPTY);
//			System.out.println(s1.status.GetCharacter());
//		}
//	}
//}
