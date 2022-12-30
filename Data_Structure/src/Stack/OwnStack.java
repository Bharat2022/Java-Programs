package Stack;

public class OwnStack {
	int capacity,top=-1;
	Object Stack[];
	public OwnStack(int capacity) {
		this.capacity = capacity;
		Stack=new Object[capacity];
	}
	
	public void push(Object ele) {
		if(top==capacity-1) {
			System.out.println("Stack OverFlow !");
			return;
		}
		Stack[++top]=ele;
	}
	
	public Object peek() {
		if(top==-1) {
			System.out.println("Stack UnderFlow !");
			return " ";
		}
		return Stack[top];
	}
	
	public int size() {
		return top+1;
	}

	public Object pop() {
		if(top==-1) {
			System.out.println("Stack UnderFlow !");
			return " ";
		}
		return Stack[top--];
	}
	
	
	@Override
	public String toString() {
		String str="[ ";
		for(int i=0;i<=top;i++)
			str=str+Stack[i]+" ";
		return str+"]";
	}
	
}
