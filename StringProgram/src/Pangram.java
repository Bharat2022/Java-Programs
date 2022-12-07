import java.util.Scanner;
class Pangram {
	public static void allLetterPresent(String str){
		str = str.toLowerCase();
		boolean allLetters = true;
		for (char ch = 'a'; ch <= 'z'; ch++) {
			if (!str.contains(String.valueOf(ch))) {
				allLetters = false;
				break;
			}
		}
		if (allLetters)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	public static boolean allLetter(String str){
		char ch[]=str.toCharArray();
		boolean cr[]=new boolean[ch.length];
		int eq=0;
		for(int i=0;i<ch.length;i++) {
			if(cr[i]==false&&ch[i]>='a'&&ch[i]<='z'||(ch[i]>='A'&&ch[i]<='Z')) {
				int count=1;
				for(int j=i+1;j<ch.length;j++) {
					if(ch[i]==ch[j]){
						cr[j]=true;
						count++;
					}
				}
				if(count==1)
					eq++;
			}
		}
		return eq==26;
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		System.out.println("String is Pangram : "+allLetter(str));
		sc.close();
	}
}
