package doubleDimensionArray;
public class MainMethod {
	public static void main(String[] args) {
		AllMethods am =new AllMethods();
		System.out.println("First matrix ");
		int arr[][]=am.read2DArray();
		am.display2DArray(arr);
		System.out.println("Biggest element : "+am.getBiggest(arr));
		System.out.println("Smallest element : "+am.getSmallest(arr));
		System.out.println("Sum of elements : "+am.getSumOfElement(arr));
//		System.out.println("Second matrix ");
//		int brr[][]=am.read2DArray();
//		am.display2DArray(brr);
//		am.sumMatrix(arr,brr);
//		am.subMatrix(arr, brr);
		am.transMatrix(arr);
		int[]rs=am.findEvenOdd(arr);
		System.out.print(" Total even number are :"+rs[0]+" and total odd number are :"+rs[1]);
	}

}
