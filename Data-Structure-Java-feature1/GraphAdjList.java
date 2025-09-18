import java.util.*;

class GraphAdjList {
    private List<List<Integer>> adjList;

    public GraphAdjList(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>()); 
        }
    }

    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);   
        adjList.get(dest).add(src);   
    }

    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> " + adjList.get(i));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjList g = new GraphAdjList(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);

        g.printGraph();
    }
}
