package Resursions;

import java.util.Scanner;

public class SumOfFirstN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last number : ");
		int n = sc.nextInt();
		System.out.println("Sum of fisrt "+n+" number : "+getSum(n));
		sc.close();
	}
	static int getSum(int n) {
		if (n==0)
			return 0;
		return n+getSum(n-1);
	}
}
