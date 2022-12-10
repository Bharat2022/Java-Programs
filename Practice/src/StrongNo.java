import java.util.Scanner;
public class StrongNo {
    static boolean getStrong(int x){
        int temp=x,sum=0;
        do{
            int d=x%10;
            sum=sum+fact(d);
            x=x/10;
        }while(x!=0);
        return temp==sum;
    }
    static int fact(int n){
        int fact=1;
        for(int i=n;i>=1;i--)
            fact=fact*i;
    return fact;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number to check num is Strong or not : ");
        int n=sc.nextInt();
        System.out.println("Number is perfect : "+getStrong(n));
        sc.close();
    }
}
