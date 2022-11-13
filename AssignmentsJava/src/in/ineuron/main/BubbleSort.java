package in.ineuron.main;
import java.util.Scanner;
public class BubbleSort {
	public static void bsort(int arr[],int start,int end) {
		for(int i=start;i<=end;i++) {
			for(int j=start+1;j<=end-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int n;
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		n=scan.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter array elements:");
		for(int i=0;i<n;i++)
			arr[i]=scan.nextInt();
		bsort(arr,0,n-1);
		System.out.println("Array after sorting: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");

	}

}
