public class Graph_main {
public static void main(String[] args) {
   Graph_adjacency_matrix graph_adjacency_matrix=new Graph_adjacency_matrix(4);
   Graph_adjacency_matrix_weighted graph_adjacency_matrix_weighted=new Graph_adjacency_matrix_weighted(4);

   //graph_adjacency_matrix.addEdge(0,1);
   //graph_adjacency_matrix.addEdge(0,2);
   
    graph_adjacency_matrix_weighted.addEdge(0,1,20);
    graph_adjacency_matrix_weighted.addEdge(0, 2, 10);
    graph_adjacency_matrix_weighted.addEdge(2, 3, 30);
    graph_adjacency_matrix_weighted.addEdge(3, 1, 40);

//    for (boolean i[] : graph_adjacency_matrix.adjacencymatrix){
//     for(boolean j:i){
//         System.out.print(String.valueOf(j)+" ");

//     }
//     System.out.println();
//    }

   for (int i[] : graph_adjacency_matrix_weighted.adjacencymatrix){
    for(int j:i){
        System.out.print(String.valueOf(j)+ " ");

    }
    System.out.println();
   }


}    
}

class Graph_adjacency_matrix{
    public int vertices;
    public boolean[][] adjacencymatrix;

    public Graph_adjacency_matrix(int vertices){
        this.vertices=vertices;
        this.adjacencymatrix= new boolean[vertices][vertices];
    }

    public void addEdge(int source,int destination){
        this.adjacencymatrix[source][destination]=true;
        this.adjacencymatrix[destination][source]=true;//remove this for directed graph adjacency matrix 
    }
}
class Graph_adjacency_matrix_weighted{
      public int vertices;
    public int[][] adjacencymatrix;

    public Graph_adjacency_matrix_weighted(int vertices){
        this.vertices=vertices;
        this.adjacencymatrix= new int[vertices][vertices];
    }

    public void addEdge(int source,int destination,int weight){
        this.adjacencymatrix[source][destination]=weight;
    }   
    }

    
