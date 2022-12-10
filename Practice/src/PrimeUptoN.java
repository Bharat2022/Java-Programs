import java.util.Scanner;
public class PrimeUptoN {
	
	static void getPrimeSeries(int p) {
		for(int i=1;i<=p;i++) {
			boolean rs=true;
			for(int j=2;j<=i/2;j++) 
				if(i%j==0) {
					rs=false;
					break;
				}
			if(rs)
				System.out.print(i+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter last Nth prime number : ");
		int p= sc.nextInt();
		getPrimeSeries(p);
		sc.close();
	}

}
