import java.util.ArrayList;

public class GraphLinkedList {
	private ArrayList<ArrayList<Integer>> listGraph;
	
	public GraphLinkedList(int size) {
		listGraph = new ArrayList<ArrayList<Integer>>();//헤드만 생성됨
		
		
		for(int i =0; i < size+1; i++) {
		listGraph.add(new ArrayList<Integer>());
		}
	}
	
	public ArrayList<ArrayList<Integer>> getGraph(){
		return listGraph;
	}
	
	public void addUndirectedEdge(int x, int y) {
		listGraph.get(x).add(y);
	}
	
	public void addCompleteEdge(int x, int y) {
		listGraph.get(x).add(y);
		listGraph.get(y).add(x);
	}
	
	public void addVertex(int x) {
		listGraph.add(new ArrayList<Integer>());
	}
	
	public void printGraph() {
		for(int i = 1; i < listGraph.size(); i++) {
			System.out.print("Vertex " + i + ":=> ");
			for(int j = 0; j < listGraph.get(i).size(); j++) {
				System.out.print(listGraph.get(i).get(j) + " ");
			}
			System.out.println();
		}
	}
}
