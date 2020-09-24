
public class CircularLikedList<E> {
	
	Node last;
	private int size;
	
	public CircularLikedList()
	{
		last = null;
		size = 0;
	}
	public void insert(E data) {
		Node newNode = new Node(data, null);
		
		if(last == null) {//last�� ����ִ°��
			newNode.link = newNode;//�ڱ� �ڽ��� ����Ű��
			last = newNode;//last�� newNode�� �־���
		}else {
			newNode.link = last.link; //���� ó���� �̾���
			last.link = newNode; //�������� ���ο� ��带 ����Ű�� �� 
		}
		size++;
	}
	
	public int delete() {
		if(last == null) {
			System.out.println("No data!");
			return -1;
		}
		Node x = last.link;
		if(x == last)last = null;
		else {
			last.link = x.link;
			x.link = null;
			
		}
		size--;
		return 1;
	}
	public void printAll() {
		Node<E> p = last;
		System.out.print("CircularList = [");
		for(int i = 1; i <= size; i++) {
			System.out.print(p.data+ ",");
			p = p.link;
		}
		System.out.println("]");
	}
}
