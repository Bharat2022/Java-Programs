import java.util.Scanner;
public class ArmstrongNum {
	
	static boolean getArmstrong(int x) {
		int sum=0,temp=x;
		do {
			int d= x%10;
			sum=sum+d*d*d;
			x=x/10;
		}while(x!=0);
		return temp==sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check num if Armstrong or not : ");
		int n= sc.nextInt();
		System.out.println("Armstrong number : "+getArmstrong(n));
		sc.close();
	}

}
