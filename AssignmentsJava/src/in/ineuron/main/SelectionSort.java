package in.ineuron.main;
import java.util.Scanner;
public class SelectionSort {
	public static void ssort(int arr[],int start,int end) {
		for(int i=start;i<=end;i++) {
			int min=arr[i];
			int index=i;
			for(int j=i+1;j<=end;j++) {
				if(arr[j]<min) {
					min=arr[j];
					index=j;
				}
			}
			if(index!=i) {
				int temp=arr[i];
				arr[i]=arr[index];
				arr[index]=temp;
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
		ssort(arr,0,n-1);
		System.out.println("Array after sorting: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]+" ");

	}

}
