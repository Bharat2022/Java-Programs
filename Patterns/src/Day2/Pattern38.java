import java.util.Scanner;
public class Pattern38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines : ");
        int n= sc.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=2*i-1;j++)
                System.out.print("* ");   
        System.out.println();
        }   
        sc.close();
    }
}
