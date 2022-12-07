import java.util.Scanner;
public class Pattern30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines : ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=i;j>=1;j--)
                System.out.print(i+" ");
        System.out.println();
        }
        sc.close();
    }
}
