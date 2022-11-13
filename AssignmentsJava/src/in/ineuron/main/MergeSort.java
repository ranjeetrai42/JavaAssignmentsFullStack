package in.ineuron.main;
import java.util.*;
public class MergeSort {
	public static void merge(int arr[],int start,int end ,int mid) {
		int[] temp=new int[end-start+1];
		int k=0;
		int i=start,j=mid+1;
		while(i<=mid && j<=end) {
			if(arr[i]<arr[j]) 
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		while(i<=mid) 
			temp[k++]=arr[i++];
		while(j<=end)
			temp[k++]=arr[j++];
		for(int i1=0;i1<temp.length;i1++)
			arr[start+i1]=temp[i1];
	}
	public static void divide(int arr[],int start,int end) {
		int mid=start+(end-start)/2;
		if(start>=mid) {
			return;
		}
		divide(arr,start,mid);
		divide(arr,mid+1,end);
		merge(arr,start,end,mid);
		
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
		divide(arr,0,n-1);
		System.out.println("Array after sorting: ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
	}

}
