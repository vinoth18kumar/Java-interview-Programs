package interviewProgram;

public class SwapTwoNumber {
	public void usingthirdvariable() {
		//using the third variable
		int a=20;
		int b=30;
		int c;
		c=20;
		a=b;
		b=c;
		System.out.println("a value is: "+ a + " b value is:"+ b);	
	}
	public void withoutthirdvaribale() {
		//with out using the third variable
		int first=10;
		int second=20;
		//important formula to remember
		first=first-second;
		second=first+second;
		first=second-first;
		System.out.println("first value is: "+ first + " second value is:"+ second);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTwoNumber swap= new SwapTwoNumber();
		swap.usingthirdvariable();
		swap.withoutthirdvaribale();

	}

}
