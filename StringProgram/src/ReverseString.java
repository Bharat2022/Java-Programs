import java.util.Scanner;
public class ReverseString {
	static String reverseString(String st) {
		String rev="";
		for(int i=0;i<st.length();i++) {
			char ch=st.charAt(i);
			rev=ch+rev;
		}
		return rev;
	}

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str= sc.nextLine();
		str=reverseString(str);
		System.out.print(str);
		sc.close();
	}

}
