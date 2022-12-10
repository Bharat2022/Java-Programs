import java.util.Scanner;
public class CovertUpperCase {
	static String convertUpper(String st) {
		char ch[]=st.toCharArray();
		for(int i=0;i<ch.length;i++) 
			if(ch[i]>='a'&&ch[i]<='z')
				ch[i]=(char)(ch[i]-32);
		return new String(ch);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the sentence : ");
		String str= sc.nextLine();
		str=convertUpper(str);
		System.out.println(str);
		sc.close();
	}

}
