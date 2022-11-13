package in.ineuron.main;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		String s1= new String();
		String s2= new String();
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the string1: ");
		s1=scan.nextLine();
		System.out.print("Enter the string1: ");
		s2=scan.nextLine();
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		boolean flag=true;
		if(s1.length()!=s2.length())
			System.out.println("Strings are not anagram");
		else {
			for(int i=0;i<ch1.length;i++) {
				if(ch1[i]!=ch2[i]) {
					flag=false;
					break;
				}
			}
			if(flag)
				System.out.println("Strings are anagram");
			else
				System.out.println("Strings are not anagram");
		}
	}

}
