package Resursions;

import java.util.Scanner;

public class PerfectNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		System.out.println((getPrime(n,1,0))?"Number is Perfect":"Number is not Perfect");
		sc.close();
	}
	static boolean getPrime(int n,int i,int sum) {
		if(i>n/2)
			return sum==n;
		if(n%i==0)
			sum=sum+i;
		return getPrime(n,i+1,sum);
	}
}
