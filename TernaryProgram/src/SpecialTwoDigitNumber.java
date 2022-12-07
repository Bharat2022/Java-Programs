       import java.util.Scanner;
       public class SpecialTwoDigitNumber
  {
       public static void main(String [] args)
    {
       Scanner c=new Scanner(System.in);
       System.out.println("Enter number :");
       int n=c.nextInt();
       int d1=n/10;
       int d2=n%10;

       String s=((d1*d2+(d1+d2))==n)?"Special":"Not special";
       System.out.println(s+" number");
    }

 }
