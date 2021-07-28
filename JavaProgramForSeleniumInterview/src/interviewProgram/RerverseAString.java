package interviewProgram;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class RerverseAString {
	static String given="agile";
	static char[] charofstring=given.toCharArray();
	//https://cscircles.cemc.uwaterloo.ca/java_visualize/

	public void usingstringbuffer() {
		// creating the object for stringBuffer
		StringBuffer buffer=new StringBuffer();	
		//adding the value to buffer.
		buffer.append(given);
		//using reverse method
		buffer.reverse();
		System.out.println(buffer);
	}

	public void usingstringbuilder() {
		//using sting builder
		StringBuilder build= new StringBuilder(given);
		build.reverse();
		System.out.println(build);
	}

	public void usingown() {
		//own logic
		String reversed="";
		for (int i=charofstring.length-1; i>=0; i--) {
			reversed=reversed+charofstring[i];
		}
		System.out.println(reversed);
	}

	public void usingcollections() {
		//using collections class
		List<Character> list=new ArrayList<Character>();
		//for each loop to add the char[] to array list.
		for (Character character : charofstring) {
			list.add(character);	
		}
		//using reverse method from collections class, it retuns in void.
		Collections.reverse(list);
		// listIterator for iterating the list 
		ListIterator iterator=list.listIterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

	public static void main(String[] args) {
		RerverseAString obj= new RerverseAString();
		obj.usingstringbuffer();
		obj.usingstringbuilder();
		obj.usingown();
		obj.usingcollections();
	}
}
