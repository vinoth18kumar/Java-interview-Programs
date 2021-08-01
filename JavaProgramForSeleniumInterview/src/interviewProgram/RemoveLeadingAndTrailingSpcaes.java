package interviewProgram;

public class RemoveLeadingAndTrailingSpcaes {
	String givenstatement=" I love Vinoth ";
	String Afterremovingspace;
	public void usingtrim() {
		//To remove both leading and Trailing space.
		Afterremovingspace= givenstatement.trim();
		System.out.println(Afterremovingspace);
	}
	public void usingstrip() {
		//after removing both leading and Trailing space.
		Afterremovingspace=givenstatement.strip();
		System.out.println("after removing both leading and Trailing space: "+Afterremovingspace);
		//after removing  only the leading space.
		Afterremovingspace=givenstatement.stripLeading();
		System.out.println("after removing  only the leading space: "+Afterremovingspace);
		//after removing  only the Trailing space.
		Afterremovingspace=givenstatement.stripTrailing();
		System.out.println("after removing  only the Trailing space: "+Afterremovingspace);
	}
	public void usingregex() {
		//important syntax: After removing both leading and Trailing space.
		Afterremovingspace=givenstatement.replaceAll("^[ \t]+|[ \t]$", "");
		System.out.println(Afterremovingspace);
		//after removing  only the leading space.
		Afterremovingspace=givenstatement.replaceAll("^[ \t]+", "");
		System.out.println(Afterremovingspace);
		//after removing  only the Trailing space.
		Afterremovingspace=givenstatement.replaceAll("[ \t]$", "");
		System.out.println(Afterremovingspace);
	}

	public static void main(String[] args) {
		
		RemoveLeadingAndTrailingSpcaes obj=new RemoveLeadingAndTrailingSpcaes();
		obj.usingtrim();
		obj.usingstrip();
		obj.usingregex();

	}

}
