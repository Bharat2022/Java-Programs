import java.util.Scanner;
public class Pattern49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int k=1;
            for(int j=1;j<=n-i;j++) 
                System.out.print(" ");
            for(int j=1;j<=i;j++){
                System.out.print(k+" ");
                k=k*(i-j)/j;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
