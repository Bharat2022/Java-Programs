import java.util.Scanner;
public class HappyNum {

	static boolean getHappyNum(int x) {
		while(x>9) {
			int sum=0;
			do {
				int d= x%10;
				sum =sum +d*d;
				x=x/10;
			}while(x!=0);
			x=sum;
		}
		return x==1||x==7;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check num if Happy or not : ");
		int n= sc.nextInt();
		System.out.println("Happy number : "+getHappyNum(n));
		sc.close();
	}

}
