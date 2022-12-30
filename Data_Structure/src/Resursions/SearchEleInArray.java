package Resursions;
import java.util.Scanner;
public class SearchEleInArray {
	public static int findElement(int ar[],int ele) {
		return findElement(ar,ele,0);
	}
	public static int findElement(int ar[],int ele, int i) {
		if(i==ar.length)
			return -1;
		if(ar[i]==ele)
			return i;
		return findElement(ar,ele,i+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many elements you want to insert : ");
		int n=sc.nextInt();
		int ar[] = new int[n];
		System.out.println("Enter elements :");
		for(int i=0 ;i<n;i++)
			ar[i]=sc.nextInt();
		System.out.print("Enter element you want to search : ");
		int in=sc.nextInt();
		int rs=findElement(ar,in);
		if(rs==-1)
			System.out.println("Element not present");
		else
			System.out.println("Element present at "+rs+" index");
		sc.close();
	}
}
