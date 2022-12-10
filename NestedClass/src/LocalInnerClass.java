public class LocalInnerClass {
	void outerMethod() {
		System.out.println("Outer Class Method");
		int y=89;
		class InnerClass{
			void innerMethod() {
				System.out.println("Inner Class Method y : " +y);//y work in inner class as final we can't reinitialize y value 
			}
		}
		InnerClass nc=new InnerClass();
		nc.innerMethod(); 
	}
	public static void main(String[] args) {
		LocalInnerClass lnc=new LocalInnerClass();
		lnc.outerMethod();
	}

}
