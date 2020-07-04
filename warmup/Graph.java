import java.util.LinkedList;
import java.lang.StringBuilder;


public class Graph {
    int numVertices;
    int numEdges;
    // Adjacency lists
    LinkedList<Integer>[] adjLists;
    
    public Graph(int numVertices) {
        this.numVertices = numVertices;
        this.numEdges = 0;
        adjLists = (LinkedList<Integer>[])new LinkedList[numVertices];
        for(int i = 0; i < numVertices; i++) {
            adjLists[i] = new LinkedList<Integer>();
        }
    }
    
    public void addEdge(int v, int w) {
        adjLists[v].add(w);
        adjLists[w].add(v);
        numEdges++;
    }
    
    public Iterable<Integer> adjIterator(int i) {
        return adjLists[i];
    }
    
    public int getNumVertices() {
        return numVertices;
    }
    
    public int getNumEdges() {
        return numEdges;
    }
    
    public String toString() {
        System.out.println("Number of vertices: " + numVertices);
        System.out.println("Number of edges: " + numEdges);
        StringBuilder buf = new StringBuilder();
        for(int i = 0; i < numVertices; i++) {
            buf.append("\n" + i + "->" + " ");
            for(Integer adj : adjIterator(i)) {
                buf.append(adj + " ");
            }
        }
        return buf.toString();
    }
    
    public static void main(String[] args) {
        Graph graph = new Graph(3);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        System.out.println(graph.toString());
    }
}
