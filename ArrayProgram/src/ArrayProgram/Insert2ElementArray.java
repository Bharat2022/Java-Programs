package ArrayProgram;
import java.util.Scanner;
public class Insert2ElementArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of elements in array :");
		int n=sc.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		
		System.out.print("Enter 1st element you want to insert: ");
		int ele=sc.nextInt();
		System.out.print("Enter 1st element index: ");
		int in=sc.nextInt();
	
		int br[]=insertArray(ar,ele,in);
		
		System.out.print("Enter 2nd element you want to insert: ");
		int ele2=sc.nextInt();
		System.out.print("Enter 2nd element index: ");
		int in2=sc.nextInt();
		
		int cr[]=insertArray(br,ele2,in2);
		System.out.println("Array : ");
		for(int i=0;i<cr.length;i++)
			System.out.print(cr[i]+" ");
		sc.close();
	}
	public static int[] insertArray(int[] ar,int ele,int in) {
		
		int yr[]=new int[ar.length+1];
		yr[in]=ele;
		if(in<0||in>ar.length) {
			System.out.println("Index not in the range: ");
			return ar;
		}
		for(int i=0;i<ar.length;i++) 
			if(i<in)
				yr[i]=ar[i];
			else
				yr[i+1]=ar[i];
		return yr;
	}

}

