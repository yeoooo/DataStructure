
public class StackArray<E> {
	public E[] array;
	public int top;
	final static int SIZE = 10;
	
	
	public StackArray() {
		array = (E[])new Object[SIZE]; //E�� ������ �����Ͻÿ� � ������ Ÿ������ JVM�� �� �� ���� ������ �ϴ� 
		top = -1;					//Object�� ������
	}
	
	public boolean isEmpty() {
		return (top==-1);
		}
	public boolean isFull() {
		return (top == SIZE -1);
	}
	public void push(E data) {
		array[top+1] = data;
		top++;
	}
	
	public E pop() {
		if(isEmpty()) {
			System.out.println("No data!");
			return null;
		}else {
		E returnData = array[top];
		top--;
		return returnData;
		}
	}
	public E peek() {
		if(isEmpty()) {
			System.out.println("No data!");
			return null;
		}else {
			return array[top];
			
		}
	}
}
