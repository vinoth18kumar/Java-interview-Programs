package interviewProgram;

public class ReplaceVowelsWithDollars {
	String  givenstatement="I miss India";
	String replaced="";
	// converting the statement to lower case
	String lowercase=givenstatement.toLowerCase();
	public void withoutusingregex() {
		// important point: converting the string to char Array. to replace the letters.
		char[] statementarry=lowercase.toCharArray();
		//finding the length of given statement.
		int  statementlength=givenstatement.length();
		// looping to check all the char in string.
		for (int i = 0; i < statementlength; i++) {
			if ((lowercase.charAt(i)=='a')||(lowercase.charAt(i)=='e')||(lowercase.charAt(i)=='i')
					||(lowercase.charAt(i)=='o')||(lowercase.charAt(i)=='u')) {
				//replacing the char to *
				statementarry[i]='*';	
			}
		}
		//printing the care array
		System.out.println(statementarry);
	}

	public void usingregex() {
		//using regex to replace the vowels with *
		replaced=lowercase.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replaced);
		//using regex to replace the vowels with $
		replaced=lowercase.replaceAll("[AEIOUaeiou]", "\\$");
		System.out.println(replaced);
	}

	public static void main(String[] args) {
		ReplaceVowelsWithDollars obj= new ReplaceVowelsWithDollars();
		obj.withoutusingregex();
		obj.usingregex();
	}

}
