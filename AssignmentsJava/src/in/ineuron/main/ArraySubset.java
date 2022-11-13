package in.ineuron.main;
import java.util.*;
public class ArraySubset {
	public static void main(String[] args) {
		int n1,n2;
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in);
		System.out.print("Enter the size of the parent array: ");
		n1=scan.nextInt();
		System.out.print("Enter the size of the child array which is to be searched: ");
		n2=scan.nextInt();
		if(n1<n2) {
			System.out.println("Child array cannot be bigger the parent aray");
			System.exit(0);
		}
		int[] arr2=new int[n2];
		int[] arr1=new int[n1];
		System.out.println("Enter the elements of the parent array:");
		for(int i=0;i<n1;i++) {
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter the elements of the child array");
		for(int i=0;i<n2;i++) {
			arr2[i]=scan.nextInt();
		}
		boolean found=false;
		for(int i=0;i<n1-n2;i++) {
			boolean flag=true;
			int k=i;
			for(int j=0;j<n2;j++) {
				if(arr1[k++]!=arr2[j]) {
					flag=false;
					break;
				}
			}
			if(flag) {
				found=true;
				break;
			}
		}
		if(found) 
			System.out.println("Child array is a subset of parent array");
		else
			System.out.println("Child array is not a subset of parent array");
	}

}
