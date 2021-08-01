package interviewProgram;

import java.util.Arrays;
import java.util.HashSet;

public class FindMissingAlphabetInAString {
	//Find the missing alphabet in the given string
	String given="vinoth";
	String str="abcdefghijklmnopqurstuvwxyz";
	public void FindMissingAlphabet() {
		//converting the string to string array using split method.
		String[] givenarray=given.split("");
		String[] strarray=str.split("");
		//important syntax: creating hashset and adding the string array to it.
		HashSet<String> givenset= new HashSet<String>(Arrays.asList(givenarray));
		HashSet<String> strset= new HashSet<String>(Arrays.asList(strarray));
		//logic to remove alphabet which is matched, so we can get the missed set. 
		strset.removeAll(givenset);
		//printing the hash set.
		System.out.println(strset);	
	}

	public static void main(String[] args) {
		FindMissingAlphabetInAString obj= new FindMissingAlphabetInAString();
		obj.FindMissingAlphabet();

	}

}
