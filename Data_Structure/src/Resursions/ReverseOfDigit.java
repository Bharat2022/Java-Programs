package Resursions;

import java.util.Scanner;

public class ReverseOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		System.out.println("Resverse of "+n+" : "+getReverse(n,0));
		sc.close();
	}
	static int getReverse(int n,int rev) {
		return (n==0)?rev:getReverse(n/10, rev*10+n%10);
	}
}
