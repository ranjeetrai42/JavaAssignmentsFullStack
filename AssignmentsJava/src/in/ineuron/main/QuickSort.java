package in.ineuron.main;

import java.util.Scanner;

public class QuickSort {
	public static int partition(int arr[],int start,int end) {
		int pivot=end;
		int i=start-1;
		for(int j=start;j<end;j++) {
			if(arr[j]<arr[pivot]) {
				i++;
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		i++;
		int temp=arr[i];
		arr[i]=arr[pivot];
		arr[pivot]=temp;
		return i;
	}
	public static void qsort(int arr[],int start,int end) {
		if(start<end) {
			int pivot=partition(arr,start,end);
			qsort(arr,start,pivot-1);
			qsort(arr,pivot+1,end);
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
		for(int i=0;i<n;i++) {
			arr[i]=scan.nextInt();
		}
		qsort(arr,0,n-1);
		System.out.println("Array after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
