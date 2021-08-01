package interviewProgram;

public class ExtractNumbersFromStringAndAdd {
	String givennname="vinothkumar18";
	int total=0;	
	public void Usingisdigit() {
		// getting the length of given string.
		int namelength=givennname.length();
		//looping to get all the char of the string.
		for (int i = 0; i < namelength; i++) {
			char charvalue=givennname.charAt(i);
			//important point: checking the char is digit
			if(Character.isDigit(charvalue)) {
				//important point: getNumericValue method used to get the numeric value from char
				//and return the value in Integer data type. so we can use it for adding. 
				total=total+Character.getNumericValue(charvalue);
			}
		}
		System.out.println(total);
	}

	public static void main(String[] args) {
		ExtractNumbersFromStringAndAdd obj= new ExtractNumbersFromStringAndAdd();
		obj.Usingisdigit();
	}

}
