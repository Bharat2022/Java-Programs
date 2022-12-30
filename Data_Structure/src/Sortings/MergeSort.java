package Sortings;

public class MergeSort {
	
	static void getDiv(int[] ar,int l,int h) {
		if(l<h) {
			int mid=(l+h)/2;
			getDiv(ar,l,mid);
			getDiv(ar,mid+1,h);
			mergeSort(ar,mid,l,h);
		}
	}
	static void mergeSort(int ar[],int m,int l,int h) {
		System.out.println(m+" "+l+" "+h);
		int l1=m-l+1;
		int l2=h-m;
		int a[]=new int[l1];
		int b[]=new int[l2];
		for(int i=0;i<l1;i++)
			a[i]=ar[l+i];
		for(int i=0;i<l2;i++)
			b[i]=ar[m+1+i];
		
		int i=0,j=0,k=l;
		while(i<l1 && j<l2)
			if(a[i]<b[i])
				ar[k++]=a[i++];
			else
				ar[k++]=b[j++];
		while(i<l1)
			ar[k++]=a[i++];
		while(j<l2)
			ar[k++]=b[j++];
	}
	
	public static void main(String[] args) {
		int ar[]= {43,27,2,7,12,10};
		getDiv(ar,0,ar.length);
		for(int i:ar)
			System.out.print(i+" ");
	}
}
