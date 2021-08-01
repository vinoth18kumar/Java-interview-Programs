package interviewProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SmallestNumberInAnArray {
	//we have three option to find the smallest number in an array

	Integer givenarray[]= {5,7,3,23,2,6,12};

	public void UsingOwn() {
		int smallest=Integer.MAX_VALUE;
		for(int i=0; i<givenarray.length; i++) {
			if (givenarray[i]<smallest) {
				smallest=givenarray[i];
			}
		}	
		//we should print outside the for loop
		System.out.println("smallest number is: " + smallest);
	}

	public void UsingCollections() {
		//converting the array to list and saving in a list variable.
		List<Integer> list=Arrays.asList(givenarray);
		//sorting the list using connections class and sort method.
		Collections.sort(list);
		//to get the 1st index of the list we use get method.
		int smallest=list.get(0);
		System.out.println("smallest number is: " + smallest);
	}

	public void UsingArrays() {
		//sorting the array using Arrays class from java.util
		Arrays.sort(givenarray);
		System.out.println(givenarray[0]);
	}

	public static void main(String[] args) {
		SmallestNumberInAnArray obj= new SmallestNumberInAnArray();

		obj.UsingOwn();
		obj.UsingArrays();
		obj.UsingCollections();


	}
}