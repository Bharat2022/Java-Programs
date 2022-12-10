package Sortings;
import java.util.Scanner;
public class SelectionSort {
	
	public static void selectionSort(int ar[]) {
		for(int i=0;i<ar.length;i++) {
			int index=i;
			for(int j=i+1;j<ar.length;j++) {
				if(ar[index]>ar[j])
					index=j;
				int temp=ar[i];
				ar[i]=ar[index];
				ar[index]=temp;
			}
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
		selectionSort(ar);
		for(int i: ar)
			System.out.println(i);
		sc.close();
	}

}
