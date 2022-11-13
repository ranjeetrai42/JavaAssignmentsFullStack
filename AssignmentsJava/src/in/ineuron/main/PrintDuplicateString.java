package in.ineuron.main;
import java.util.*;
public class PrintDuplicateString {

	public static void main(String[] args) {
		String s= new String();
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the string: ");
		s=scan.nextLine();
		s=s.toLowerCase();
		int[] arr=new int[26];
		for(int i=0;i<s.length();i++)
			arr[(int)s.charAt(i)-97]++;
		System.out.print("Duplicate characters from the input string are: ");
		for(int i=0;i<26;i++) {
			if(arr[i]!=0) {
				System.out.print((char)(97+i));
			}
		}
	}

}
