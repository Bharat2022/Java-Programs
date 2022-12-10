import java.util.Scanner;
import java.util.Scanner;
public class XylemPhloem {

    static String getXylemPhloem(int x){
        int mid=0,fl=0;
        fl=x%10;
        x=x/10;
        while(x>9){
            int d= x%10;
            mid=mid+d;
            x=x/10;
        }
        fl=fl+x;
        return (fl==mid)?"Xylem":"Phloem";
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the number to check xylem or phloem : ");
        int n=sc.nextInt();
        System.out.println("Number is : "+getXylemPhloem(n));
        sc.close();
    }    
}
