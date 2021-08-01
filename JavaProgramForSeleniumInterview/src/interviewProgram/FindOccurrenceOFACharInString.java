package interviewProgram;

public class FindOccurrenceOFACharInString {
	String givenname="VinothkumarK";
	char tofind='k';
	int occurrence=0;
	//finding the length of the given name
	int givennamelength=givenname.length();

	public void usingIteration() {
		//converting the given name to lower case
		givenname=givenname.toLowerCase();
		//looping to find the occurrence of char 
		for (int i = 0; i < givennamelength; i++) {
			if(givenname.charAt(i)==tofind) {
				occurrence++;	
			}	
		}
		System.out.println(tofind + " character is found for: "+ occurrence);
	}

	public void withoutusingiteration() {
		//replacing the tofind char with empty char
		String replacedname=givenname.replace("k", "");
		//finding the length of replaced name
		int replacenamelength=replacedname.length();
		//calculating the occurrence with length difference 
		occurrence= givennamelength-replacenamelength;
		System.out.println(tofind + " character is found for: "+ occurrence);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindOccurrenceOFACharInString obj = new FindOccurrenceOFACharInString();
		obj.usingIteration();
		obj.withoutusingiteration();

	}

}
