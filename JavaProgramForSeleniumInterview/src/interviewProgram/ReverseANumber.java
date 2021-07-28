package interviewProgram;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// https://cscircles.cemc.uwaterloo.ca/java_visualize/
		//int givennumber=1245;
		int givennumber=0;
		int reversednumber=0;
		
		//scanner class from java.util is to get the input from console.
		System.out.println("enter the number: ");
		Scanner scan=new Scanner(System.in);
		givennumber=scan.nextInt();
		
		//important formula to remember
		while(givennumber!=0) {
		reversednumber=reversednumber*10;
		reversednumber=reversednumber+givennumber%10;
		givennumber=givennumber/10;
		}
		System.out.println(reversednumber);
	}

}
