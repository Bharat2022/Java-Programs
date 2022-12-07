import java.util.Scanner;
public class FreqStrSameAlpa {
	static void freqStringEle(String st) {
		int count[]=new int[26];
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if(ch>='A'&&ch<='Z')
				count[ch-65]++;
			else if(ch>='a'&&ch<='z')
				count[ch-97]++;
		}
		for(int i=0;i<count.length;i++)
			if(count[i]!=0)
				System.out.println((char)(i+65)+" ---> "+count[i]);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String str=sc.nextLine();
		System.out.println("Frequency of each letter : ");
		freqStringEle(str);
		sc.close();
	}
}
