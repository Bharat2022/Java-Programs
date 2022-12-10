import java.util.Scanner;
public class Ptr5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Line : ");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=i;j>=1;j--)
				System.out.print(j+" ");
			System.out.println();
		}
		sc.close();
	}

}
