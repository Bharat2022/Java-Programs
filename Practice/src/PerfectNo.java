import java.util.Scanner;
public class PerfectNo {
    
    static boolean getPerfect(int x){
        int temp=x,sum=0;
        for(int i=1;i<=x/2;i++){
            if(x%i==0)
                sum=sum+i;
        }
        return temp==sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check num is perfect or not : ");
        int n=sc.nextInt();
        System.out.println("Number is perfect : "+getPerfect(n));
        sc.close();
    }
}
