package Resursions;

import java.util.Scanner;

public class ZerotoN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter last number : ");
		int n = sc.nextInt();
		getNumber(n);
		sc.close();
	}
	static void getNumber(int n) {
		if(n>1)
			getNumber(n-1);
		System.out.println(n);
		
	}
}
