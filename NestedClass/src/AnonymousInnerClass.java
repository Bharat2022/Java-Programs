class Demo{
	void show() {
		System.out.println("I am show method of super class");
	}
}

public class AnonymousInnerClass {
	static Demo d=new Demo() {
		void show() {
			super.show();
			System.out.println("I am in Anonymous");
		}
	};
	public static void main(String[] args) {
		d.show();
	}

}
