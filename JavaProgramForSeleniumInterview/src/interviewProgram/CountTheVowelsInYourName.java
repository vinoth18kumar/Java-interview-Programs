package interviewProgram;

public class CountTheVowelsInYourName {
	//Find the number of vowels in the given string
	public void usingownlogic() {
		String  givenstatement="Vinothkumark";
		int occurrence=0;
		// converting the statement to lower case occurrence 
		String lowercase=givenstatement.toLowerCase();
		//finding the length of given statement.
		int  statementlength=givenstatement.length();
		// looping to check all the char in string.
		for (int i = 0; i < statementlength; i++) {
			if ((lowercase.charAt(i)=='a')||(lowercase.charAt(i)=='e')||(lowercase.charAt(i)=='i')
					||(lowercase.charAt(i)=='o')||(lowercase.charAt(i)=='u')) {
				occurrence++;
			}
		}
		System.out.println(occurrence);
	}
	public static void main(String[] args) {
		CountTheVowelsInYourName obj = new CountTheVowelsInYourName();
		obj.usingownlogic();		
	}

}
