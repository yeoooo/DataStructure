
public class DLL<T> {
	
	public DNode<T> head;
	public int size;
	
	public DLL() {
		head = null;
		size = 0;
	}
	
	public void insertFront(T newdata) {
		DNode newNode = new DNode<T>(null, newdata, null);
		
		if(head == null) {
			head = newNode;
		}else
		newNode.rightLink = head;//newNode의 오른쪽 링크에 첫 노드를 넣어줌
		head.leftLink = newNode;//첫 노드의 왼쪽 노드에 (Front) 새로운 노드 
		head = newNode; // 헤드가 새로운 노드를 가리키게 함 
	}
	public void insertAfter(T target, T newdata) {
		DNode newNode = new DNode<T>(null, newdata, null);
		DNode t = findNode(target);//t에 타겟노드 
		if(head == null) {
			head = newNode;
		}else {
		newNode.leftLink = t;
		newNode.rightLink = t.rightLink;
		t.rightLink = newNode; // 뒤에 넣을 거기 때문에 오른쪽링크에 새로운노드
		t.rightLink.leftLink = newNode; // 타겟 다음 노드의 왼족 노드를 연결 
	
		}
		size++;
	}
	public DNode findNode(T data) {//특정 데이터를 가지는 노드를 찾기 링크를 타고가면서 맞는 노드가 있는지 check
		DNode p = head;
		while(p!= null) {
			p = p.rightLink;
			if(p.data == data) {
				break;
			}
		}
		return p;
		
	
	}
	public void printAll() {
		DNode p = head;
		System.out.print("List = [");
		while(p != null) {
			System.out.print(p.data + ",");
			p = p.rightLink;
		}
		System.out.println("]");
	}
	
}
