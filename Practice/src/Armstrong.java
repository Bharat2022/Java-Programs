import java.util.Scanner;
public class Armstrong {

    static boolean getArmstrong(int n){
        int c=getDigit(n);
        int sum=0,temp=n;
        do{
            int d=n%10;
            sum=sum+pow(d,c);
            n=n/10;
        }while(n!=0);
    return temp==sum;
    }
    static int getDigit(int x){
        int count=0;
      do{
            count++;
            x=x/10;
        } while(x>0);
        return count;
    }
    static int pow(int n,int p){
        int pro=1;
        while(p>0){
            pro=pro*n;
            p--;
        }
        return pro;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check number is armstrong or not : ");
        int n =sc.nextInt();
        System.out.println("Number is Armstrong : "+getArmstrong(n));
        sc.close();
    }
}
