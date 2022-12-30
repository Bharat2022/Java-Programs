package Resursions;
import java.util.Scanner;
public class PrintNto1 {
	public static void display(int n) {
		System.out.print(n+" ");
		if(n>1)
			display(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		display(n);
		sc.close();
	}
}
