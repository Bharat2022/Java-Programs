import java.util.Scanner;
public class PerfectNum {

	static boolean getPerfect(int x) {
		int p=0,temp=x;
		for(int i=1;i<=x/2;i++)
			if(x%i==0)
				p=p+i;
		return temp==p;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check num if perfect or not : ");
		int n= sc.nextInt();
		System.out.println("Number is Perfect : "+getPerfect(n));
		sc.close();
	}

}
