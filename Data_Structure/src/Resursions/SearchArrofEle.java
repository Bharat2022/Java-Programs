package Resursions;

import java.util.Scanner;

public class SearchArrofEle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Search number : ");
		int n = sc.nextInt();
		int ar[]= {1,2,4,6,87,32,7,9,36};
		System.out.println((getPosition(n,ar,0)>0)?"Element position : "+(getPosition(n,ar,0)+1):" Element Not Found");
		sc.close();
	}
	static int getPosition(int n, int[] br,int i) {
		if(i==br.length)
			return -1;
		if(n==br[i])
			return i;
		return getPosition(n, br, i+1);
	}
}
