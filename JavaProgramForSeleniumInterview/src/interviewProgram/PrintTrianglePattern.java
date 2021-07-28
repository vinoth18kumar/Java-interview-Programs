package interviewProgram;

import java.util.Iterator;
import java.util.Scanner;

public class PrintTrianglePattern {
	public void starpattern() {
		//getting user input from console for number of rows
		System.out.println("enter the no of rows: ");
		Scanner scan=new Scanner(System.in);
		int numberofrows=scan.nextInt();

		int row,column;
		//for loop print in pattern
		for (row = 0; row < numberofrows; row++) {
			for (column = 0;  column< row; column++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}

	}

	public void numberpattern() {
		//getting user input from console for number of rows
		System.out.println("enter the no of rows: ");
		Scanner scan=new Scanner(System.in);
		int numberofrows=scan.nextInt();

		int row,column;
		int startingnumber=1;
		//for loop print in pattern
		for (row = 0; row < numberofrows; row++) {
			for (column = 0;  column< row; column++) {
				System.out.print(startingnumber+" ");
				startingnumber++;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		PrintTrianglePattern obj=new PrintTrianglePattern();
		obj.starpattern();
		obj.numberpattern();


	}

}
