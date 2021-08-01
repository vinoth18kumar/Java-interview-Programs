package interviewProgram;

public class ReverseWordInASentence {
	
	public void UsingOwn() {
		String givenword="I love you";
		String reversed="";
		//split returns in array of string.
		String[] str= givenword.split(" ");
		int len=str.length;
		
		for(int i=str.length-1;i>=0;i--)
		{
		reversed=reversed+str[i]+" ";	
		}
		System.out.println(reversed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseWordInASentence obj=new ReverseWordInASentence();
		obj.UsingOwn();
	}

}
