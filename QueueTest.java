
public class QueueTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> q = new Queue<String>();
		
		q.enQueue("A");
		q.enQueue("B");
		q.enQueue("C");
		q.enQueue("D");
		q.enQueue("D");
		q.enQueue("D");
		q.enQueue("E");
		q.printAll();
		
	}

}
