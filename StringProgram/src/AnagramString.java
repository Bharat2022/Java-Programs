import java.util.Scanner;
public class AnagramString {
	
	static boolean getAnagram(String st,String st1) {
		char ar[]=st.toCharArray();
		char br[]=st1.toCharArray();
		int eq=0;
		if(ar.length!=br.length)
			eq=0;
		else {
			for(int i=0;i<ar.length;i++) {
				for(int j=0;j<br.length;j++) {
					if(br[j]==ar[i]) {
						eq++;
						break;
					}
				}
			}
		}
		System.out.println(eq+" "+ar.length);
		return (eq==ar.length);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First String : ");
		String str = sc.nextLine();
		System.out.print("Enter the Second String : ");
		String str1 = sc.nextLine();
		System.out.println("String is Anagram : "+getAnagram(str,str1));
		sc.close();
	}

}
