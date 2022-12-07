         import java.util.Scanner;
         public class NumberEqualOrNot
   {
         public static void main(String [] args)
     {
         Scanner c=new Scanner(System.in);
         System.out.println("Enter first number :");
         int n1=c.nextInt();
         System.out.println("Enter second number :");
         int n2=c.nextInt();

         String sc=(n1==n2)?"Equal":"Not Equal";
         System.out.println(sc+" number");
    }

 }
