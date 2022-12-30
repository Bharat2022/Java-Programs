package Resursions;
import java.util.Scanner;
public class PrimeNumber {
	public static void primeNumbers(int n,int i) {
		if(n%i!=0)
			System.out.println(n+" ");
		if(i<n)
			primeNumbers(n-1,i+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value of n : ");
		int n=sc.nextInt();
		primeNumbers(n,2);
		sc.close();
	}
}
