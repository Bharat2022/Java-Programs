import java.util.Scanner;
public class AnagramStr {
	static boolean getAnagram(String str,String str2) {
		int count[]=new int[26];
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		
		int count2[]=new int[26];
		for(int i=0;i<str2.length();i++) {
			char ch=str2.charAt(i);
			if(ch>='A'&&ch<='Z')
				count2[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count2[ch-97]++;
		}
		
		for(int i=0;i<count.length;i++)
			if(count[i]!=count2[i])
				return false;
		return true;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the 1st String : ");
		String str = sc.nextLine();
		System.out.print("Enter the 2nd String : ");
		String str2 = sc.nextLine();
		System.out.println("Two Strings is Anagram : "+getAnagram(str,str2));
		sc.close();
	}
}
