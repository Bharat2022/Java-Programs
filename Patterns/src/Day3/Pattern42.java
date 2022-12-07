import java.util.Scanner;
public class Pattern42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of lines: ");
        int n=sc.nextInt();
        int sp=0,st=n;
        for(int i=1;i<=n;i++){
            int k=(st+1)/2;
            for(int j=1;j<=sp;j++)
                System.out.print("  ");
            for(int j=1;j<=st;j++){
                System.out.print((char)(k+64)+" ");
                if(j<=st/2)
                    k--;
                else
                    k++;
            }
            if(i<=n/2){
                sp++;
                st=st-2;
            }
            else{
                sp--;
                st=st+2;
            }
            System.out.println();
        }
        sc.close();
    }
    
}
