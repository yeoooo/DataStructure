
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
		
		if(last == null) {//last가 비어있는경우
			newNode.link = newNode;//자기 자신을 가리키고
			last = newNode;//last에 newNode를 넣어줌
		}else {
			newNode.link = last.link; //끝과 처음을 이어줌
			last.link = newNode; //마지막이 새로운 노드를 가리키게 함 
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
