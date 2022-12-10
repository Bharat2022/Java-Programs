import java.util.Scanner;
public class StrongNum {
	
	static boolean getStrongNum(int x) {
		int sum=0,temp=x;
		do {
			int d=x%10;
			sum = sum+fact(d);
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}
	
	static int fact(int x) {
		int fact=1;
		while(x>0) {
			fact=fact*x;
			x--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check num is strong or not : ");
		int n =sc.nextInt();
		System.out.println("Number is Strong : "+getStrongNum(n));
		sc.close();
	}

}
