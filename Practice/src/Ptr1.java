import java.util.Scanner;
public class Ptr1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Line : ");
		int n= sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				System.out.print(j+" ");
			System.out.println();
		}
		sc.close();
	}

}
