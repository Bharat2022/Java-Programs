public class StaticInnerClass {
	private static void outerMethod() {
		System.out.println("Inside OuterMethod");
	}
	static class Inner{
		void display() {
			System.out.println("Inside InnerMethod");
			outerMethod();
		}
	}
	public static void main(String[] args) {
		StaticInnerClass.Inner snc = new StaticInnerClass.Inner();
		snc.display();
	}

}
