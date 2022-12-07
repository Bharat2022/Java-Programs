import java.util.Scanner;
public class PangramStr {
	
	static boolean getPangram(String str) {
		if(str.length()<26)
			return false;
		int count[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<count.length;i++)
			if(count[i]==0)
				return false;
		return true;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("String is Pangram : "+getPangram(str));
		sc.close();
	}
}
