/*         2
 *       2 3 2
 *     2 3 5 3 2
 *   2 3 5 7 5 3 2
 * 2 3 5 7 11 7 5 3 2
 */
import java.util.Scanner;
public class Pattern1{
    static int[] isPrime(int n){
        int k=0;
        int nr[]=new int[n];
        for(int i=2; i<=2*n+1;i++){
            boolean rs=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    rs=false;
                    break;
                }
            }
            if(rs)
                nr[k++]=i;    
        }
            return nr;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines: ");
        int n=sc.nextInt();
        int ar[]=isPrime(n);
        for(int i=0;i<=ar.length-1;i++)
            System.out.print(ar[i]+" ");
        System.out.println();
        for(int i=1;i<=n;i++){
            int x=0;
            for(int j=1;j<=n-i;j++)
                System.out.print("  ");
            for(int j=1;j<=i*2-1;j++){
                System.out.print(ar[x]+" ");
                if(j<i)
                x++;
                else
                x--;
               
            }
            System.out.println();
        }

        sc.close();
    }

}
