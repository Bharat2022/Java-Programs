import java.util.Scanner;
public class HappyNo {
    static boolean getHappy(int x){
        while(x>9){
            int sum=0;
            do{
                int d=x%10;
                sum=sum+d*d;
                x=x/10;
            }while(x!=0);
            x=sum;
        }
        return x==1||x==7;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to check num is happy or not : ");
        int n=sc.nextInt();
        System.out.println("Number is Happy: "+getHappy(n));
        sc.close();
    }
}
