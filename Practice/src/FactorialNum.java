import java.util.Scanner;
public class FactorialNum {

	static int getFactorial(int x) {
		if(x==1)
			return x;
		return (x*getFactorial(x-1));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int n= sc.nextInt();
		System.out.println(n+" Factorial : "+getFactorial(n));
		sc.close();
	}

}
