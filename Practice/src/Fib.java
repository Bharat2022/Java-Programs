class Fib
{
	static int fib(int n)
	{
		System.out.println("intput: "+n);
		if (n <= 1) {
			return n;
		}
		System.out.println("first: "+(n-1));
		System.out.println("second: "+(n-2));
		System.out.println();
	return fib(n-1) + fib(n-2);
	}
	
	public static void main (String args[])
	{
	int n = 5;
	System.out.println(fib(n));
	}
}

