import java.util.Scanner;
public class Ptr14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter how many Line : ");
		int n= sc.nextInt();
		int sp=n/2,st=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=sp;j++)
				System.out.print("  ");
			for(int j=1;j<=st;j++)
				System.out.print((j==1||j==st)?"* ":"  ");
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
