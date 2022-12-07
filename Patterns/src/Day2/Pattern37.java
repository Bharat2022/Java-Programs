import java.util.Scanner;
public class Pattern37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines : ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i;j++)
                System.out.print(j%2+" ");   
            for(int j=i-1;j>=1;j--) 
                System.out.print(j%2+" ");
        System.out.println();
        }   
        sc.close();
    }
}
