import java.util.Scanner;
public class Ptr4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Line : ");
		int n= sc.nextInt();
		for(int i=n;i>=1;i--) {
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		sc.close();
	}

}
