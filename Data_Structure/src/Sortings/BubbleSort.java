package Sortings;
import java.util.Scanner;
public class BubbleSort {
//	public String toString() {
//		return null;
//	}
	public static void bubbleSort(int ar[]) {
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar.length-1;j++)
				if(ar[j]>ar[j+1]) {
					int temp=ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
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
		bubbleSort(ar);
		for(int i: ar)
			System.out.println(i);
		sc.close();
	}

}
