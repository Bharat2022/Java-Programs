package doubleDimensionArray;
import java.util.Scanner;
public class AllMethods {
	Scanner sc=new Scanner(System.in);
	public int[][] read2DArray() {
        System.out.println("Enter the dimension of the matrix :");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int arr [][]=new int[n1][n2];
        System.out.println("Enter "+n1*n2+" elements in the array :"); 
        for(int i=0;i<arr.length;i++)
       	 for(int j=0;j<arr[i].length;j++)
       		 arr[i][j]=sc.nextInt();
        return arr;
	}
	
	public void display2DArray(int[] arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print("  "+arr[i][j]+"  ");
			System.out.println();
		}
	}
	
	static void display2DArray2(int[] arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++)
				System.out.print("  "+arr[i][j]+"  ");
			System.out.println();
		}
	}
	
	public int getBiggest(int[][] mat)
    {
           int big=mat[0][0];
           for(int i=0;i<mat.length;i++)
                for(int j=0;j<mat[i].length;j++)
                     if(mat[i][j]>big)
                    	 big=mat[i][j];
          return big;
    }	
	
	public int getSmallest(int[][] mat)
    {
           int big=mat[0][0];
           for(int i=0;i<mat.length;i++)
                for(int j=0;j<mat[i].length;j++)
                     if(mat[i][j]<big)
                    	 big=mat[i][j];
          return big;
    }	
	
	public int getSumOfElement(int [][] mat) {
		int sum=0;
		for(int i=0;i<mat.length;i++)
			for(int j=0;j<mat[i].length;j++)
				sum=sum+mat[i][j];
		return sum;
	}
	
    public int[][] sumMatrix(int[][] x,int[][] y)
    {
      if(x.length !=y.length || x[0].length !=y[0].length){
    	System.out.println("Order of matrix is not same.Order of matrix must be same .");
   		return null;
      }
      int mat [][]=new int[x.length][x[0].length];
       for(int i=0;i<x.length;i++)
    	   for(int j=0;j<x[i].length;j++)
    		   mat [i][j]=x[i][j]+y[i][j];
       System.out.println("Sum of Matrix elements : ");
       display2DArray2(mat);
      return mat;
    }
    
    public int[][] subMatrix(int[][] x,int[][] y)
    {
      if(x.length !=y.length || x[0].length !=y[0].length){
    	System.out.println("Order of matrix is not same.Order of matrix must be same .");
   		return null;
      }
      int mat [][]=new int[x.length][x[0].length];
       for(int i=0;i<x.length;i++)
    	   for(int j=0;j<x[i].length;j++)
    		   mat [i][j]=x[i][j]-y[i][j];
       System.out.println("Difference of Matrix elements : ");
       display2DArray2(mat);
      return mat;
    }
    
    public int[][] transMatrix(int[][] x){
    	int[][] mat=new int[x.length][x[0].length];
    	for(int i=0;i<x.length;i++)
    		for(int j=0;j<x[i].length;j++)
    			mat[j][i]=x[i][j];
    	System.out.println("Transpose of matrix :");
    	display2DArray2(mat);
    	return mat;
    }
    
    public int [] findEvenOdd(int[][] x){
         int even=0,odd=0;
         for(int i=0;i<x.length;i++)
        	 for(int j=0;j<x[i].length;j++)
        		 if(x[i][j]%2==0)
        			 even++;
                 else
                	 odd++;
         int arr []={even,odd};
         return arr;
    }
    
}
