package in.ineuron.main;
import java.util.*;
public class MaxFreqChar {
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
		int max=0;
		int index=-1;
		for(int i=0;i<26;i++) {
			if(max<arr[i]) {
				max=arr[i];
				index=i;
			}
		}
		System.out.println("Maximum frequency character is: "+(char)(97+index));

	}

}
