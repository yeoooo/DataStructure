import java.util.NoSuchElementException;



public class StackList<E> {
	public Node<E> top;
	public Node<E> head;
	public int size;
	
	public StackList() {
		top = null;
		size = 0;
	}
	
	public void push(E newData) {
		Node<E> newNode = new Node(newData, top);
		top = newNode;
		size++;
	}
	
	public E pop() {
		if(size == 0) throw new NoSuchElementException();
		E data = top.data;
		top = top.link;
		size--;
		return data;
	}
	public boolean isEmpty() {
		return (size==0);
		
	}
	public E peek() {
		return top.data;
	}
	public void printAll() {
		Node<E> p = top;
		while(p != null) {
			if(p==top) {
				System.out.print(p.data);
				System.out.println("<=top");
			}else
				System.out.println(p.data);
			p = p.link;
		}
	}

}
