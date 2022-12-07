import java.util.Scanner;
public class CountDigit {
	static int countDigit(String st) {
		int count=0;
		for(int i=0;i<st.length();i++) {
			char ch =st.charAt(i);
			if(ch>='0'&&ch<='9')
				count++;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str= sc.nextLine();
		int c=countDigit(str);
		System.out.print("Number of Digit : "+c);
		sc.close();
	}

}
