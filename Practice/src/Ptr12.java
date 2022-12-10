import java.util.Scanner;
public class Ptr12{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Line : ");
		int n= sc.nextInt();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			int k=1;
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int j=1;j<=st;j++) {
				System.out.print(k+" ");
				k=(j<=st/2)?k+1:k-1;
			}
			if(i<=n/2) {
				sp--;
				st=st+2;
			}
			else {
				sp++;
				st=st-2;
			}
			System.out.println();
		}
		sc.close();
	}

}
