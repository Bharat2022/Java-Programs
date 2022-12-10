
public class FibonacciRecursion {

	static int n1=0,n2=1,n3=0;
	static void getFibonacci(int x) {
		if(x>0){
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3+" ");
			getFibonacci(x-1);
		}
	}
	public static void main(String[] args) {
		int n= 100;
		System.out.print(n1+" "+n2);
		getFibonacci(n-2);
	
	}

}
