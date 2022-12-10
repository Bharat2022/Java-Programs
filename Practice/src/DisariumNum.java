import java.util.Scanner;
public class DisariumNum {

	static boolean getDisariumNum(int x) {
		int sum=0,temp=x;
		int c=digitsCount(x);
		do {
			int d=x%10;
			sum= sum+pow(d,c);
			x=x/10;
			c--;
		}while(x!=0);
		return sum==temp;
	}
	
	static int digitsCount(int n) {
		int count=0;
		do {
			count++;
			n=n/10;
		}while(n!=0);
		return count;
	}
	
	static int pow(int n, int p) {
		int pro=1;
		do {
			pro=pro*n;
			p--;
		}while(p>0);
		return pro;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check num if Disarium or not : ");
		int n= sc.nextInt();
		System.out.println("Number is Perfect : "+getDisariumNum(n));
		sc.close();
	}

}
