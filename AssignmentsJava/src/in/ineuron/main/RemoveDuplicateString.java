package in.ineuron.main;
import java.util.*;
public class RemoveDuplicateString {

	public static void main(String[] args) {
		String s= new String();
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the string: ");
		s=scan.nextLine();
		String res="";
		for(int i=0;i<s.length();i++) {
			boolean flag=true;
			for(int j=0;j<res.length();j++) {
				if(s.charAt(i)==res.charAt(j)) {
					flag=false;
					break;
				}
			}
			if(flag) {
				res=res+s.charAt(i);
			}
		}
		System.out.println("String after removing duplicates is: "+res);
	}

}
