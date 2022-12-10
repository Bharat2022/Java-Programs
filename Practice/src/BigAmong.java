import java.util.Scanner;
public class BigAmong {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter three number to check biggest among : ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		String big=(a>b&&a>c)?"Biggest : "+a:(b>c)?"Biggest : "+b:"Biggest : "+c;
		System.out.println(big);
		sc.close();
	}

}
