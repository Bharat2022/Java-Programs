import java.util.Scanner;
public class Ptr17{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Line : ");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) 
				System.out.print((i==1||i==n||j==1||j==n||i+j==n+1||i==j)?"* ":"  ");
			System.out.println();
		}
		sc.close();
	}

}
