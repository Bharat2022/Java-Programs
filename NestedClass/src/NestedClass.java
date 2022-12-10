public class NestedClass {
	static int x=10;
	public class InnerClass{
		static int h=9;
		void innerMethod() {
			System.out.println("Inner Method x : "+x);
		}
	}
	public static void main(String[] args) {
		//NestedClass.InnerClass nc=new NestedClass().new InnerClass();
		NestedClass nestclass=new NestedClass();
		NestedClass.InnerClass nc=nestclass.new InnerClass();
		nc.innerMethod();
		System.out.println(InnerClass.h);
	}

}
