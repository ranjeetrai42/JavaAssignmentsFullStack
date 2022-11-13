package in.ineuron.main;
import java.util.*;

public class DuplicatesInArray {

	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		n=scan.nextInt();
		System.out.println("Enter the array elements");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		int arrdup[]=new int[n];
		int k=0;
		Arrays.sort(arr);
		for(int i=1;i<n;i++) {
			if(arr[i]==arr[i-1]) {
				if(k==0||arr[k-1]!=arr[i]) {
					arrdup[k]=arr[i];
					k++;
				}
			}
		}
		if(k==0) {
			System.out.println("No duplicates in the aray");
		}
		else {
			System.out.println("Duplicates are: ");
			for(int i=0;i<k;i++) {
				System.out.print(arrdup[i]+" ");
			}
		}
	}

}
