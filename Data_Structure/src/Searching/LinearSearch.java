package Searching;

public class LinearSearch {
	
	static int search(int arr[], int n, int x){
		for (int i = 0; i < n; i++) 
			if (arr[i] == x)
				return i+1;
		return -1;
	}

	public static void main(String[] args){
		int[] arr = { 3, 4, 1, 7, 5 };
		int x = 4;
		System.out.println((search(arr, arr.length, x) == -1)?"Element is not present in the array":"Element found at position " +search(arr, arr.length, x)); 
	}
}
