
public class GraphArray {
	private int[][] array;
	private boolean[] visited;
	private StackArray<Integer> stack;
	
	
	
	public GraphArray(int size) {//size�� vertex�� ũ��
		array = new int[size+1][size+1]; //�������� ���� 1�߰�
		visited = new boolean[size+1];
		
		initVisited();
	}
	
	public int[][] getArray() {
		return array;
		
	}
	
	public boolean isEmpty() {
		return array == null; //array�̰� ��������� vertex�� ��������
		
	}
	
	public void addUndirectedEdge(int x, int y) {//edge�� ����
		array[x][y] = 1;
		
	}
	public void addCompleteEdge(int x, int y) {
		array[x][y] = 1;
		array[y][x] = 1;
		
	}
	public void deleteUndirectedEdge(int x, int y) {
		array[x][y] = 0;
	}
	public void deleteCompleteEdge(int x, int y) {
		array[x][y] = 0;
		array[y][x] = 0;
	}
	public void initVisited() {//���־��̴� �޼ҵ带 �̸� ����
		for(int i = 0; i<visited.length; i++) {
			visited[i] = false;
		}
	}
//	
//	public void DFS(int startV) { //������ �̿��� DFS �߿���
//		stack = new StackArray<Integer>();
//		stack.push(startV);
//		visited[startV] = true;
//		System.out.print("DFS ���� = " + startV);
//		
//		while(!stack.isEmpty()) {
//			int currentV = stack.peek();
//			boolean flag = false;
//			
//			for(int i =1; i<array[0].length; i++) {
//				if((array[currentV][i] ==1)&&(visited[i] == false)) {//������ ������ �湮�� ���� ���ٸ� 
//					stack.push(i);
//					visited[i] = true;
//					System.out.print(" => " + i);
//					flag = true;
//					break;
//				}
//			}
//			if(flag == false) stack.pop();//�� if ���� ������� �ʾ�����, �� �̹� Ž���� ���̶�� stack�� �ϳ� ����
//				}
//			}
//		
	
	
	public void BFS(int startV) {
		Queue<Integer> q = new Queue<Integer>();
		initVisited();
		
		q.enQueue(startV);
		visited[startV] = true;
		System.out.print("BFS ����(ť) = " + startV);
		
		while(!q.isEmpty()) {
			int v = q.deQueue();
		
			for(int i =1; i<array[0].length; i++) {
				if((array[v][i] == 1) && (visited[i] == false)) {//������ �ִ� ������ �湮���� ������
					q.enQueue(i);
					visited[i] = true;
				}
			}
		}
	}
	
		
	public void printArray() {
		for(int i =0; i < array.length; i++) {
			for(int j =0; j< array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}	