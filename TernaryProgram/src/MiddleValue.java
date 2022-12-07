           import java.util.Scanner;
           public class MiddleValue
  {
           public static void main(String [] args)
      {
           Scanner c=new Scanner(System.in);
           System.out.println("Enter first number :");
           int n1=c.nextInt();
           System.out.println("Enter second number :");
           int n2=c.nextInt();
           System.out.println("Enter third number :");
           int n3=c.nextInt();

           int middle=(n1>n2 && n1<n3)?n1:(n2>n1 && n2<n3)?n2:n3;
           System.out.println(middle+" is middle value.");

     }

  }
