import java.util.Scanner;
public class DecBinConvert {

	static String dectoBin(int dec) {
		String bin=" ";
		do {
			int d=dec%2;
			bin=d+bin;
			dec=dec/2;
		}while(dec!=0);
		return bin;
	}
	
	static int bintoDec(int bin) {
		int pw=1,dec=0;
		do {
			int d=bin%10;
			dec=dec+d*pw;
			pw=pw*2;
			bin=bin/10;
		}while(bin!=0);
		return dec;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter decimal : ");
		int d=sc.nextInt();
		System.out.println(d+" Binary : "+dectoBin(d));
		System.out.print("Enter Binary : ");
		int b= sc.nextInt();
		System.out.println(b+" Decimal : "+bintoDec(b));
		sc.close();
	}

}
