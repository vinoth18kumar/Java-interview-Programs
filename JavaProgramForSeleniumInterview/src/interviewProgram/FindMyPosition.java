package interviewProgram;

import java.util.Scanner;

public class FindMyPosition {

	public static void main(String[] args) {
		//To find the position of an English alphabet
		//ASCII 97->a, 65->A
		
		//getting  the input from user via console.
		Scanner scan= new Scanner(System.in);
		System.out.println("pls enter the character: ");
		
		//getting the char from user and saving in the char variable. 
		char givenchar=scan.next().charAt(0);
		//converting the char to lower case using Character class.
		givenchar=Character.toLowerCase(givenchar);
		//doing type casting the char to int to get the ascii value.
		int ascii=(int)givenchar;
		//important formula to remember to find the position of char
		int position=ascii-96;  // position=ascii-64; to find the Caps letter position.
		System.out.println(position);
	}

}
