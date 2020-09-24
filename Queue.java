public class Queue<E> {
	Node<E> front;
	Node<E> rear;
	int size;
	
	public Queue() {
		front = null;
		rear = null;
		size = 0;
	}
	
	public boolean isEmpty() {
		return (front == null);
	}
	public void enQueue(E data) {
		if(isEmpty()) {
			Node<E> newNode = new Node<E>(data, null);
			front = newNode;
			rear = newNode;
		}else {
		Node<E> newNode = new Node<E>(data, null);
		rear.link = newNode;
		rear = newNode;
		
		}
	}
	public E deQueue() {
		if(isEmpty()) {
			System.out.println("No data!");
			return null;
		}else {
			
		Node<E> old = front; //E oldData = front.data;
		front = front.link;
		
		size--;
		return old.data;
		}
	}
	public E Peek() {
		if(isEmpty()) {
			System.out.println("No data!");
			return null;
		}
		return front.data;
	}
	public int getSize() {
		return size;
	}
	public void printAll() {
		Node<E> p = front;
		while(p != null) {
			System.out.println( p.data + "");
			p = p.link;
		}
	}
}
