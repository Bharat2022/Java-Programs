        import java.util.Scanner;
        public class LeapYear
  { 
        public static void main(String [] args)
     {
        Scanner c=new Scanner(System.in);
        System.out.println("Enter year :");
        int n=c.nextInt();

        String s=(n%400==0 ||(n%4==0 && n%100!=0))?"Leap year":"Not Leap year";
        System.out.println(n+" is "+s);
     }

  }
