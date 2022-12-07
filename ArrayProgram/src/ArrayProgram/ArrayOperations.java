package ArrayProgram;
import java.util.Scanner;
public class ArrayOperations{
	
Scanner sc = new Scanner(System.in);
	
	public int[] readArray() {
		System.out.print("Enter the size of an array: ");
		int n= sc.nextInt();
		int[] ar=new int[n];
		System.out.println("Enter "+n+" Elements:");
		for(int i=0;i<ar.length;i++)
			ar[i]=sc.nextInt();
		return ar;
	}
	
	void dispArray(int[] ar) {
		System.out.println("Array: ");
		for(int i=0;i<ar.length;i++)
			System.out.print(ar[i]+ " ");
		System.out.println();
	}
	
	int getBiggest(int[] ar) {
		int big =ar[0];
		for(int i=0;i<ar.length;i++)
			if(ar[i]>big)
				big=ar[i];
		return big;
	}
	
	int getSmallest(int[] ar) {
		int small =ar[0];
		for(int i=0;i<ar.length;i++) 
			if(ar[i]<small)
				small=ar[i];
		return small;
	}
	
	int getSumofArray(int[] ar) {
		int sum=0;
		for(int i=0;i<ar.length;i++)
			sum=sum+ar[i];
		return sum;
	}
	
	int countPrime(int[] ar) {
		int count =0;
		for(int i=0;i<ar.length;i++) {
			boolean rs= isPrime(ar[i]);
			if(rs)
				count++;
		}
		return count;
	}
	private boolean isPrime(int x) {
		for(int i=2;i<=x/2;i++)
			if(x%i==0)
				return false;
		return true;
	}
	
	int[] countEvenOdd(int[] ar) {
		int even=0,odd=0;
		for(int i=0;i<ar.length;i++) 
			if(ar[i]%2==0)
				even++;
			else
				odd++;
		return new int[] {even,odd};
	}
	
	int[] countNegPos(int[] ar) {
		int neg=0,pos=0;
		for(int i=0;i<ar.length;i++)
			if(ar[i]<0)
				neg++;
			else
				pos++;
		return new int[] {neg,pos};
	}
	
	public void sumofdigArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			int sum=0;
			while(ar[i]!=0) {
				int d=ar[i]%10;
				sum=sum+d;
				ar[i]=ar[i]/10;
			}
			ar[i]=sum;
		}
	}
	
	public int[] getPair(int[] ar,int n) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++)
				if(ar[i]+ar[j]==n)
					return new int[] {ar[i],ar[j]};
		}
		return null;
	}
	
	public int[] getPairIndex(int[] ar,int n) {
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++)
				if(ar[i]+ar[j]==n)
					return new int[] {i,j};
		}
		return null;
	}
	
	public void reverseArray1(int[] ar) {
		for(int i=0;i<ar.length/2;i++) {
			int temp=ar[i];
			ar[i]=ar[ar.length-1-i];
			ar[ar.length-1-i]=temp;
		}
	}
	
	public void reverseArray2(int[] ar) {
		for(int i=0,j=ar.length-1;i<j;i++,j--) {
			int temp=ar[i];
			ar[i]=ar[j];
			ar[j]=temp;
		}
	}

	public int[] mergeArray(int[]ar,int[] br) {
		int[] pr=new int[ar.length+br.length];
		for(int i=0;i<ar.length;i++) 
			pr[i]=ar[i];
		for(int i=0;i<br.length;i++) 
			pr[i+ar.length]=br[i];
		return pr;
	}
	
	public int[] reduceArray(int[] ar) {
		for(int i=0;i<ar.length;i++) {
			while(ar[i]>9) {
				int sum=0;
				do {
					int d=ar[i]%10;
					sum=sum+d*d;
					ar[i]=ar[i]/10;
				}while(ar[i]!=0);
				ar[i]=sum;
			}
		}
		return ar;
	}

	public int[] sortArray(int[] ar) {
		for(int i=0;i<ar.length-1;i++) {
			for(int j=0;j<ar.length-i-1;j++) {
				 if (ar[j] > ar[j + 1]) {
	                    int temp = ar[j];
	                    ar[j] = ar[j + 1];
	                    ar[j + 1] = temp;
	                }
			}
		}
		return ar;
	}

	public int[] sortTwoArray(int[] ar,int[] br) {
		int sa[]= new int[ar.length+br.length];
		int i=0,j=0,k=0;
		while(i<ar.length&&j<br.length) {
			if(ar[i]<br[j])
				sa[k++]=ar[i++];
			else
				sa[k++]=br[j++];
		}
		while(i<ar.length)
			sa[k++]=ar[i++];
		while(j<br.length)
			sa[k++]=br[j++];
		return sa;
	}
	
	public int[] zigZagArray(int[] ar,int[] br) {
		int[] pr=new int[ar.length+br.length];
		int i=0,k=0;
		while(i<ar.length&&i<br.length) {
			pr[k++]=ar[i];
			pr[k++]=br[i++];
		}
		while(i<ar.length)
			pr[k++]=ar[i++];
		while(i<br.length)
			pr[k++]=br[i++];
		return pr;
	}
	
	public int[] insertArray(int[] ar) {
		System.out.print("Enter element you want to insert: ");
		int ele=sc.nextInt();
		System.out.print("Enter index: ");
		int in=sc.nextInt();
		int yr[]=new int[ar.length+1];
		yr[in]=ele;
		if(in<0||in>ar.length) {
			System.out.println("Index not in the range: ");
			return ar;
		}
		for(int i=0;i<ar.length;i++) {
			if(i<in)
				yr[i]=ar[i];
			else
				yr[i+1]=ar[i];
		}
		return yr;
	}

	public int[] deleteIndex(int[] ar) {
		System.out.print("Enter index you want remove 0 to n-1 : ");
		int index=sc.nextInt();
		int[] cr = new int[ar.length-1];
		if(index<0||index>ar.length) {
			return ar;
		}
		for(int i=0;i<cr.length;i++) {
			if(i<index)
				cr[i]=ar[i];
			else
				cr[i]=ar[i+1];
		}
	return cr;
	}
	
	public int[] commonElement(int[] ar, int[] br) {
		int cr[]=new int[ar.length];
		int k=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=0;j<br.length;j++) 
				if(ar[i]==br[j])
					cr[k++]= ar[i];
		}
		int rs[]=new int[k];
		for(int i=0;i<k;i++)
			rs[i]=cr[i];
		return rs;
	}
 
	public int nBiggest(int[] ar) {
		System.out.print("Enter biggest n value: ");
		int n=sc.nextInt();
		for(int i=0;i<ar.length;i++) {
			int count=0;
			for(int j=0;j<ar.length;j++)
				if(ar[j]>ar[i])
					count++;
			if(count==n-1)
				return ar[i];
		}
		return -1;
	}
	
	public int[] insertArrtoArr(int[] ar, int[] br) {
		System.out.print("Enter index: ");
		int in=sc.nextInt();
		int[] nr=new int[ar.length+br.length];
		if(in<0||in>ar.length) {
			System.out.println("Index not in the range: ");
			return ar;
		}
		for(int i=0;i<br.length;i++)
			nr[in+i]=br[i];
		for(int i=0;i<ar.length;i++) {
			if(i<in)
				nr[i]=ar[i];
			else
				nr[i+br.length]=ar[i];
		}
		return nr;
	}
	
	public void equalArray(int[] ar,int[]br) {
		int eq=0;
		if(ar.length!=br.length)
			eq=0;
		else {
			for(int i=0;i<ar.length;i++) {
				for(int j=0;j<br.length;j++)
					if(br[j]==ar[i])
						eq++;
			}
		}
		System.out.println((eq==ar.length)?"Given two Arrays is equal":"Given two Arrays is not equal");	
	}

	//with comparing itself
	public void freqofArray(int ar[]) {
		boolean cr[]=new boolean[ar.length];
		for(int i=0;i<ar.length;i++) {
			if(cr[i]==false) {
				int count=1;
				for(int j=i+1;j<ar.length;j++) {
					if(ar[i]==ar[j]){
						cr[j]=true;
						count++;
					}
				}
				System.out.println(ar[i]+" ---> "+count+" time");
			}
		}
	}
	
	public void freq(int ar[]) {
		int big=ar[0];
		for(int i=0;i<ar.length;i++)
			if(ar[i]>big)
				big=ar[i];
		int count[]=new int[big+1];
		for(int i=0;i<ar.length;i++)
			count[ar[i]]++;
		for(int i=0;i<count.length;i++)
			if(count[i]!=0)
				System.out.println(i+"--->"+count[i]);
	}
}


	
