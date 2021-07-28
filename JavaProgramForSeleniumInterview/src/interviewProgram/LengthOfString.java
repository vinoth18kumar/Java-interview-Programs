package interviewProgram;

public class LengthOfString {

	public static void main(String[] args) {
		// To find the length of string without using length method.
		String name="Vinothkumar";
		System.out.println(name.length());
		//converting the string to char[]
		char[] name_char=name.toCharArray();
		int length=0;
		for (char c : name_char) {
			length++;
		}
		System.out.println(length);
	}

}
