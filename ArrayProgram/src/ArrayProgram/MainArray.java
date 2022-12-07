package ArrayProgram;
public class MainArray {
	public static void main(String[] args) {
		ArrayOperations ao = new ArrayOperations();
		int ar[]=ao.readArray();
		
		//int br[]=ao.readArray();
		
		
	/*	int biggest=ao.getBiggest(ar);
		System.out.println("Biggest Element : "+biggest);
		
		int smallest=ao.getSmallest(ar);
		System.out.println("Smallest Element : "+smallest);
		
		int sumofarr=ao.getSumofArray(ar);
		System.out.println("Sum of Elements : "+sumofarr);
		
		int countprime=ao.countPrime(ar);
		System.out.println("Count Prime Elements : "+countprime);
		
	
		int[] countEO=ao.countEvenOdd(ar);
		System.out.println("Count Even Elements : "+countEO[0]);
		System.out.println("Count Odd Elements : "+countEO[1]);
		
		int[] countNP=ao.countNegPos(ar);
		System.out.println("Count Negative Elements : "+countNP[0]);
		System.out.println("Count Positive Elements : "+countNP[1]); 
		*/
		ao.sumofdigArray(ar);
		System.out.print("After add digit of each elements ");
		ao.dispArray(ar);
		/*
		int pr[]=ao.getPair(ar, 15);
		System.out.println((pr==null)?"There is no pair":"15 pair of elements :"+pr[0]+" , "+pr[1]);
		
		
		
		int index[]=ao.getPairIndex(ar, 15);
		if(index==null)
			System.out.println("There is no pair");
		else
			System.out.println("15 pair of elements index :"+index[0]+" , "+index[1]); 
		
		ao.reverseArray1(ar);
		System.out.print("After Reverse ");
		ao.dispArray(ar);
		
		ao.reverseArray2(ar);
		System.out.print("After Reverse ");
		ao.dispArray(ar); 
		
		int ma[]=ao.mergeArray(ar,br);
		System.out.print("After Merge ");
		ao.dispArray(ma);  
		
		int mr[]=ao.reduceArray(ar);
		System.out.print("After Reduce ");
		ao.dispArray(mr); 
		
		int sr[]=ao.sortArray(ar);
		System.out.print("After Sorting ");
		ao.dispArray(sr); 
		
		int sort[]=ao.sortTwoArray(ar, br);
		System.out.print("After Sorting ");
		ao.dispArray(sort); 
		
		int indexdel[]=ao.deleteIndex(ar);
		System.out.print("After Index removed ");
		ao.dispArray(indexdel);
		
		int zig[]=ao.zigZagArray(ar, ar);
		System.out.print("Merge into zig-zag ");
		ao.dispArray(zig); 
		
	int ins[]=ao.insertArray(ar);
		System.out.print("After insertion ");
		ao.dispArray(ins);
		
		int cM[]=ao.commonElement(ar, br);
		System.out.print("Common Elements in ");
		ao.dispArray(cM);
		
		ao.equalArray(ar, br); 
		
	    int nbig= ao.nBiggest(ar);
		System.out.println("Biggest "+nbig);
		
		int inar[]=ao.insertArrtoArr(ar, br);
		System.out.print("After insert array in another ");
		ao.dispArray(inar);
		
		ao.freqofArray(ar);
		ao.freq(ar);*/
		
		
		
	}

}
