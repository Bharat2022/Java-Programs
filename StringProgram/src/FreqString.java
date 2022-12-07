import java.util.Scanner;
public class FreqString {
	
	static void freqStringEle(String st) {
		int count[]=new int[128];
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++)
			if(count[i]!=0&&count[i]>1)
				System.out.println((char)i+" ---> "+count[i]);
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
