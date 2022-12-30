package Sortings;

public class Bubble {
	public static void main(String[] args) {
		int ar[]= {14,33,27,35,10};
		for(int i=0;i<ar.length;i++) {
			for(int j=1;j<ar.length;j++) {
				if(ar[j-1]>ar[j]) {
					int temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(int i:ar)
			System.out.print(i +" ");
	}
}
