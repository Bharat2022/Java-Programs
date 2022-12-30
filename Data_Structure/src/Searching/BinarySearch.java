package Searching;

public class BinarySearch {
	
	int binarySearch(int arr[], int x, int l, int r){
		if (r <l) 
			return -1;
		int mid=(l+r)/2;
		return (arr[mid] == x)?mid:(arr[mid] < x)?binarySearch(arr,x,mid+1,r):binarySearch(arr,x,l,mid-1);
	}

	public static void main(String args[])
	{
		BinarySearch ob = new BinarySearch();
		int arr[] = { 2, 3, 4, 10, 40 };
		int x = 10;
		int result = ob.binarySearch(arr, x,0, arr.length - 1);
		if (result == -1)
			System.out.println("Element not present");
		else
			System.out.println("Element found at index "
							+ result);
	}
}
