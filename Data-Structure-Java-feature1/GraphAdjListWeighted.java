import java.util.*;

class GraphAdjListWeighted {
    private List<List<int[]>> adjList; 

    public GraphAdjListWeighted(int vertices) {
        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>()); 
        }
    }

    public void addEdge(int src, int dest, int weight) {
        adjList.get(src).add(new int[]{dest, weight});
    }

    public void printGraph() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -> ");
            for (int[] edge : adjList.get(i)) {
                System.out.print("(" + edge[0] + ", w=" + edge[1] + ") ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        GraphAdjListWeighted g = new GraphAdjListWeighted(4);
        g.addEdge(0, 1, 20);
        g.addEdge(0, 2, 10);
        g.addEdge(2, 3, 30);
        g.addEdge(3, 1, 40);

        g.printGraph();
    }
}
