
public class GraphArray {
	private int[][] array;
	private boolean[] visited;
	private StackArray<Integer> stack;
	
	
	
	public GraphArray(int size) {//size는 vertex의 크기
		array = new int[size+1][size+1]; //직관성을 위해 1추가
		visited = new boolean[size+1];
		
		initVisited();
	}
	
	public int[][] getArray() {
		return array;
		
	}
	
	public boolean isEmpty() {
		return array == null; //array이가 비어있으면 vertex도 마찬가지
		
	}
	
	public void addUndirectedEdge(int x, int y) {//edge는 간선
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
	public void initVisited() {//자주쓰이는 메소드를 미리 정의
		for(int i = 0; i<visited.length; i++) {
			visited[i] = false;
		}
	}
//	
//	public void DFS(int startV) { //스택을 이용한 DFS 중요함
//		stack = new StackArray<Integer>();
//		stack.push(startV);
//		visited[startV] = true;
//		System.out.print("DFS 순서 = " + startV);
//		
//		while(!stack.isEmpty()) {
//			int currentV = stack.peek();
//			boolean flag = false;
//			
//			for(int i =1; i<array[0].length; i++) {
//				if((array[currentV][i] ==1)&&(visited[i] == false)) {//간선은 있지만 방문할 곳은 없다면 
//					stack.push(i);
//					visited[i] = true;
//					System.out.print(" => " + i);
//					flag = true;
//					break;
//				}
//			}
//			if(flag == false) stack.pop();//위 if 문이 실행되지 않았으면, 다 이미 탐색한 곳이라면 stack을 하나 빼줌
//				}
//			}
//		
	
	
	public void BFS(int startV) {
		Queue<Integer> q = new Queue<Integer>();
		initVisited();
		
		q.enQueue(startV);
		visited[startV] = true;
		System.out.print("BFS 순서(큐) = " + startV);
		
		while(!q.isEmpty()) {
			int v = q.deQueue();
		
			for(int i =1; i<array[0].length; i++) {
				if((array[v][i] == 1) && (visited[i] == false)) {//인접해 있는 간선이 방문한적 없으면
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