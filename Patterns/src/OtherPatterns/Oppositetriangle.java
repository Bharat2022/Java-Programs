package OtherPatterns;
import java.util.Scanner;
public class Oppositetriangle {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines : ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
        	for(int j=1;j<=i;j++)
        		System.out.print("* ");
        	for(int j=(2*i-2);j<(2*n-2);j++)
        		System.out.print("  ");
        	for(int j=1;j<=i;j++)
        		System.out.print("* ");
        System.out.println();
        }   
        sc.close();
    }
}
