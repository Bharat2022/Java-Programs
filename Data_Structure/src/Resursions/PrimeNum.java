package Resursions;

import java.util.Scanner;

public class PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println((getPrime(n,1))?"Number is Prime":"Number is not prime");
		sc.close();
	}
	static boolean getPrime(int n,int i) {
		return (i>=n/2)?true:(n%i==0)?false:getPrime(n,i+1);
	}
}

