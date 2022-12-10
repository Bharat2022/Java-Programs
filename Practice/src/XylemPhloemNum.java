import java.util.Scanner;
public class XylemPhloemNum {

	static String getXylemPhloem(int x) {
		int os=0,ms=0;
		os=x%10;
		x=x/10;
		while(x>9) {
			ms=ms+x%10;
			x=x/10;
		}
		os=os+x;
		return (os==ms)?"Xylem":"Phloem";
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to check num is xylem or phloem : ");
		int n =sc.nextInt();
		System.out.println("Number is : "+getXylemPhloem(n));
		sc.close();
	}

}
