package in.ineuron.main;
import java.util.*;
public class UniqueCharactersString {
	public static void main(String[] args) {
		String s= new String();
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the string: ");
		s=scan.nextLine();
		s=s.toLowerCase();
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++)
			if((int)s.charAt(i)-97>=0 && (int)s.charAt(i)-97<=122)
				arr[(int)s.charAt(i)-97]++;
		boolean flag=true;
		for(int i=0;i<26;i++) {
			if(arr[i]>1) {
				flag=false;
				break;
			}
		}
		if(flag) 
			System.out.println("Input string contains unique characters");
		else
			System.out.println("Input string does not contain unique characters");

	}

}
