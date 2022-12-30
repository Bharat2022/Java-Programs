package Resursions;

import java.util.Scanner;

public class FactofNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last number : ");
		int n = sc.nextInt();
		System.out.println("Factorial of fisrt "+n+" number : "+getFact(n));
		sc.close();
	}
	static int getFact(int n) {
		if(n==0)
			return 1;
		return n*getFact(n-1);
	}
}
