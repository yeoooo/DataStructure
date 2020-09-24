
public class CDL<T> implements ICircularDoubleLinkedList<T>{

	public DNode<T> last;
	public int size;
	
	public CDL() {
		last = null;
		size = 0;
	}
	
	public void insertAfter(T target, T data) {
		DNode<T> newNode = new DNode(null, data, null);
		DNode<T> t = findNode(target);
		if(last == null) {//리스트에 노드가 없을경우
			newNode.leftLink = newNode;
			newNode.rightLink = newNode;//자기 자신을 가리키게 함
			last = newNode;//last를 자신으로 함
		}else {
			newNode.leftLink = t;
			newNode.rightLink = t.rightLink;
			t.rightLink = newNode;
			newNode.rightLink.leftLink = newNode;
		}
		size++;
		
	}
	public void insertPrevious(T target, T data) {
		DNode<T> newNode = new DNode(null, data, null);
		DNode<T> t = findNode(target);
		if(last == null) {
			newNode.leftLink = newNode;
			newNode.rightLink = newNode;
			last = newNode;
		}else {
			newNode.leftLink = t.leftLink;
			newNode.rightLink = t;
			
			t.leftLink = newNode;
			newNode.leftLink.rightLink = newNode;
		}
		size++;
	}
		


	public void removeAfter(T target) {
		// TODO Auto-generated method stub
		if(last == null) {
			System.out.println("No data!");
		}else {
			DNode<T> t = findNode(target);
			
			t.rightLink = t.rightLink.rightLink;
			t.rightLink.rightLink.leftLink = t;
			
			size--;
		}
	}


	public void removePrevious(T target) {
		// TODO Auto-generated method stub
		if(last == null) {
			System.out.println("No data!");
		}else {
			DNode<T> t = findNode(target);
			t.leftLink = t.leftLink.leftLink;
			t.leftLink.leftLink.rightLink = t;
		}
		size--;
	}

	@Override
	public int search(T data) {
		int count = 0;
		DNode p = last;
		for(int i = 0; i < size; i++) {
			if(p.data != data) {
				count++;
			}
			else{
				break;
			}
			return count;
		}
		
		return 0;
	}
	public DNode findNode(T target) {
		DNode<T> p = last;
		
		for(int i =0; i < size; i++) {
			if(p == target) break;
		}
		return p;
	}

	@Override
	public void printAll() {
		DNode p = last;
		System.out.print("[ ");
		for(int i = 0; i < size; i++){
			System.out.print(p.data);
			p = p.rightLink;
		}
		System.out.print("]");
		
	}
}
	
	