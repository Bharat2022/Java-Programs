package Queue;

public class OwnQueue {
	private int front,rear,capacity;
	private Object Queue[];
	public OwnQueue(int capacity) {
		this.capacity=capacity;
		front=rear=-1;
		Queue=new Object[capacity];
	}
	
	public void enQue(Object ele) {
		if(rear==capacity-1) {
			System.out.println("Queue is full !");
			return ;
		}
		if(front==-1)
			front=0;
		Queue[++rear]=ele;
	}
	
	public Object deQue() {
		if(front==-1) {
			System.out.println("Queue is empty !");
			return " ";
		}
		if(front>rear)
			front=rear=-1;
		return Queue[rear];
	}
	
	public int size() {
		if(front==-1)
			return 0;
		return rear-front+1;
	}
	
	public String toString() {
		String str="[ ";
		for(int i=front;i<=rear;i++)
			str=str+Queue[i]+" ";
		return str+"]";
	}
	
}
