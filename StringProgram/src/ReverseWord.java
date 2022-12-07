import java.util.Scanner;
public class ReverseWord {
	
	static String getReverseWord(String st) {
		char ch[]=st.toCharArray();
		int f=0;
		for(int i=0;i<ch.length;i++) {
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
				f=i;
			else if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ') {
				for(int j=i;j>=f;j--) {
					char temp=ch[j];
					ch[j]=ch[f];
					ch[f++]=temp;
				}
			}
		}
		return new String(ch);
				
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sentence : ");
		String str=sc.nextLine();
		System.out.println("After Reverse word : "+getReverseWord(str));
		sc.close();
	}

}
