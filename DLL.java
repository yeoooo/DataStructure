
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
		newNode.rightLink = head;//newNode�� ������ ��ũ�� ù ��带 �־���
		head.leftLink = newNode;//ù ����� ���� ��忡 (Front) ���ο� ��� 
		head = newNode; // ��尡 ���ο� ��带 ����Ű�� �� 
	}
	public void insertAfter(T target, T newdata) {
		DNode newNode = new DNode<T>(null, newdata, null);
		DNode t = findNode(target);//t�� Ÿ�ٳ�� 
		if(head == null) {
			head = newNode;
		}else {
		newNode.leftLink = t;
		newNode.rightLink = t.rightLink;
		t.rightLink = newNode; // �ڿ� ���� �ű� ������ �����ʸ�ũ�� ���ο���
		t.rightLink.leftLink = newNode; // Ÿ�� ���� ����� ���� ��带 ���� 
	
		}
		size++;
	}
	public DNode findNode(T data) {//Ư�� �����͸� ������ ��带 ã�� ��ũ�� Ÿ���鼭 �´� ��尡 �ִ��� check
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
