import java.util.Scanner;
public class Ptr6{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Line : ");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=n-i;j++)
				System.out.print("  ");
			for(int j=1;j<=2*i-1;j++) {
				System.out.print(k%2+" ");
				k=(j<i)?k+1:k-1;
			}
			System.out.println();
		}
		sc.close();
	}

}
