package ArrayProgram;
import java.util.*;
import java.awt.Point;
public class NumberSystems {
	Scanner sc = new Scanner(System.in);
	static void dispArray2(int[] ar) {
		System.out.println("Array: ");
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+ " ");
		System.out.println();
		System.out.println();
	}
	
	public void factArray(int[] br) {
		for(int i=0;i<br.length;i++) {
			int fact=1;
			for(int j=br[i];j>=1;j--)
				fact=fact*j;
			br[i]=fact;
		}
		dispArray2(br);
	}
	
	public void palinArray(int[] br) {
		for(int i=0;i<br.length;i++) {
			int temp=br[i];
			while(temp>9) {
				int sum=0;
				do {
					int d=temp%10;
					sum=sum*10+d;
					temp=temp/10;
				}while(temp!=0);
				if(br[i]==sum)
					System.out.print(br[i]+" ");
			}
		}
		dispArray2(br);
	}
	
	public void primeElements(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			boolean rs=true;
			for(int j=2;j<=ar[i]/2;j++)
				if(ar[i]%2==0)
					rs=false;
			if(rs)
				System.out.print(ar[i]+" ");
		}
	}
	
	public void armstrongArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			int temp=ar[i];
			while(temp>9) {
				int sum=0;
				do {
					int d=temp%10;
					sum=sum+d*d*d;
					temp=temp/10;
				}while(temp!=0);
				if(ar[i]==sum)
					System.out.print(ar[i]+" ");
			}
		}
	}
	
	public int destinctValue(int[] ar) {
		Set<Point> s = new HashSet<>();
		for(int i=0;i<ar.length;i++)
			for(int j=0;j<ar.length;j++)
				s.add(new Point(ar[i],ar[j]));
		return s.size();
	}
	
}
