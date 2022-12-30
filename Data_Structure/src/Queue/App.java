package Queue;

public class App {
	public static void main(String[] args) {
		OwnQueue q = new OwnQueue(5);
		q.enQue(12);
		q.enQue(23);
		System.out.println(q);
		System.out.println(q.deQue());
	}
}
