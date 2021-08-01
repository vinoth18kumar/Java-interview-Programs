package interviewProgram;

import java.util.stream.IntStream;

public class ArryaContainsElementOrNot {
	//To find the number present in the array or not.
	int[] givennumber= {2,6,8,5,8,3};
	int tofind=31;
	boolean found=false;
	//using own logic with iteration
	public void  UsingIteration() {
		for (int i = 0; i < givennumber.length; i++) {
			if(givennumber[i]==tofind) {
				found=true;
				break;
			}
		}
		if(found) 
			System.out.println("number is found");
		else
			System.out.println("number is notfound");
	}
	//using IntStream
	public void usingIntStream() {
		//important syntax to remember.
		found=IntStream.of(givennumber).anyMatch(element->element==tofind);
		if(found) 
			System.out.println("number is found");
		else
			System.out.println("number is notfound");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArryaContainsElementOrNot obj= new ArryaContainsElementOrNot();
		obj.UsingIteration();
		obj.usingIntStream();

	}

}
