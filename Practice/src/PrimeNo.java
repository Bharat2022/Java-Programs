import java.util.Scanner;
public class PrimeNo {

    static void getPrime(int x){
        for(int j=1;j<=x;j++){
            boolean rs=true;
            for(int i=2;i<=j/2;i++)
                if(j%i==0){
                    rs= false;
                    break;
                }
            if(rs)
            System.out.print(j+" ");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the last number for prime series : ");
        int n= sc.nextInt();
        System.out.println("Number is prime : ");
        getPrime(n);
        sc.close();
    }
}
