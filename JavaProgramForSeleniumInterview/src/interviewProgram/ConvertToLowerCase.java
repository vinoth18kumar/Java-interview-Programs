package interviewProgram;

public class ConvertToLowerCase {
	// To convert the case with using direct methods.
	// ASCII 97->a 122->z, 65->A 90->Z
	String lowercasestatement="i love you vinoth";
	String uppercasestatement="I LOVE INDIA";
		
	public void lowercasetouppercase() {
		//converting the string to char Array.
		char[] lowercasechararray=lowercasestatement.toCharArray();
		//finding the length of given string.
		int lowcaselength=lowercasestatement.length();
		for (int i = 0; i < lowcaselength; i++) {
			if(lowercasechararray[i]>=97 && lowercasechararray[i]<=122) {
				//calculating to change to upper case and doing the typecase to char.
				lowercasechararray[i]=(char) (lowercasechararray[i]-32);
			}
		}
		System.out.println(lowercasechararray);
	}
	public void uppercasetolowercase() {
		//converting the string to char Array.
		char[] uppercasechararray=uppercasestatement.toCharArray();
		//finding the length of given string.
		int upcaselength=uppercasestatement.length();
		for (int i = 0; i < upcaselength; i++) {
			if(uppercasechararray[i]>=65 && uppercasechararray[i]<=90) {
				//calculating to change to lower case and doing the typecase to char.
				uppercasechararray[i]=(char) (uppercasechararray[i]+32);
			}
		}
		System.out.println(uppercasechararray);
	}
	
	public static void main(String[] args) {
		ConvertToLowerCase obj= new ConvertToLowerCase();
		obj.lowercasetouppercase();
		obj.uppercasetolowercase();

	}

}
