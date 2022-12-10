package Sortings;
import java.util.Scanner;
public class InsertionSort {
	
	public static void insertionSort(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			int key=ar[i];
			int j=i-1;
			while(j>-1&&ar[j]>key) {
				ar[j+1]=ar[j];
				j--;
			}
			ar[j+1]=key;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the total numnber of elements : ");
		int n=sc.nextInt();
		int ar[]= new int[n];
		System.out.println("Enter elements : ");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		insertionSort(ar);
		for(int i: ar)
			System.out.println(i);
		sc.close();
	}

}
