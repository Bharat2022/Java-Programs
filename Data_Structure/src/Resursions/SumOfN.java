package Resursions;
import java.util.Scanner;
public class SumOfN {
	public static int sumOfNum(int n) {
		if(n==0)
			return 0;
		return n+sumOfNum(n-1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		System.out.println("Sum of numbers : "+sumOfNum(n));
		sc.close();
	}
}
