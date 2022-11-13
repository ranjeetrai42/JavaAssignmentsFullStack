package in.ineuron.main;
import java.util.*;
public class CountVowConSpecChar {
	public static void main(String[] args) {
		String s= new String();
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the string: ");
		s=scan.nextLine();
		int vow=0;
		int con=0;
		int spec=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='A'||s.charAt(i)=='e'||s.charAt(i)=='E'||s.charAt(i)=='i'||s.charAt(i)=='I'||s.charAt(i)=='o'||s.charAt(i)=='O'||s.charAt(i)=='U'||s.charAt(i)=='u')
				vow++;
			else if(s.charAt(i)>67 && s.charAt(i)<=92||s.charAt(i)>=97 &&s.charAt(i)<=122)
				con++;
			else if(s.charAt(i)<48||s.charAt(i)>57)
				spec++;
		}
		System.out.println("The count of vowels are: "+vow);
		System.out.println("The count of consonants are: "+con);
		System.out.println("The count of special characters are: "+spec);
	}

}
