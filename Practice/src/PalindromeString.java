import java.util.Scanner;
public class PalindromeString {
	static boolean palindromString(String st) {
		String rev="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			rev=ch+rev;
		}
		if(rev.equals(st))
			return true;
	return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str= sc.nextLine();
		System.out.print("String is Palindrome : "+palindromString(str));
		sc.close();
	}

}
