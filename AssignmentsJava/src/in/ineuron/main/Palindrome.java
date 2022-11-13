package in.ineuron.main;

public class Palindrome {

	public static void main(String[] args) {
		String s="2552";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s1.charAt(i)) {
				flag=false;
				break;
			}
		}
		if(flag) 
			System.out.println("Input string is a palindrome string.");
		else
			System.out.println("Input string is not a palindrome string.");
	}

}
