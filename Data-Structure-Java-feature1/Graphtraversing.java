import java.util.*;

public class Graphtraversing {
    public static void main(String[] args) {
        Graph_Adjacency_List graph_Adjacency_List = new Graph_Adjacency_List(5);

        graph_Adjacency_List.add_edge(0, 1);
        graph_Adjacency_List.add_edge(0, 2);
        graph_Adjacency_List.add_edge(1, 3);
        graph_Adjacency_List.add_edge(2, 3);
        graph_Adjacency_List.add_edge(3, 4);
        graph_Adjacency_List.add_edge(2, 4);

        // Print the adjacency list
        System.out.println(graph_Adjacency_List.graph);

        // BFS traversal
        graph_Adjacency_List.Bfs(0);

        // DFS traversal
        graph_Adjacency_List.Dfs(0);
    }
}

// Graph using adjacency list
class Graph_Adjacency_List {
    public int vertices;
    public Map<Integer, ArrayList<Integer>> graph;

    public Graph_Adjacency_List(int vertices) {
        this.vertices = vertices;
        graph = new HashMap<>();

        for (int i = 0; i < vertices; i++) {
            graph.put(i, new ArrayList<>());
        }
    }

    // Add undirected edge
    public void add_edge(int source, int destination) {
        graph.get(source).add(destination);
        graph.get(destination).add(source);
    }

    // BFS traversal
    public void Bfs(int starting) {
        boolean[] visited = new boolean[this.vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[starting] = true;
        queue.offer(starting);

        System.out.println("BFS Traversal:");
        while (!queue.isEmpty()) {
            int top = queue.poll();
            System.out.print(top + " ");

            for (int i : this.graph.get(top)) {
                if (!visited[i]) {
                    visited[i] = true;
                    queue.offer(i);
                }
            }
        }
        System.out.println();
    }

    // DFS traversal
    public void Dfs(int starting) {
        boolean[] visited = new boolean[this.vertices];
        Stack<Integer> stack = new Stack<>();

        visited[starting] = true;
        stack.push(starting);

        System.out.println("DFS Traversal:");
        while (!stack.isEmpty()) {
            int top = stack.pop();
            System.out.print(top + " ");

            for (int i : this.graph.get(top)) {
                if (!visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
        System.out.println();
    }
}
