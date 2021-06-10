package Graphs;
 
import java.util.HashMap;
import java.util.Scanner;
 
public class BellmanFord {
    public static class edge {
        int x,y;
        public edge(int x, int y) {
            this.x = x;
            this.y = y;
        }
        public String toString() {
            return this.x + " " + this.y;
        }
    }
 
    public static class Node {
        int value;
        int distance;
        String path;

        public Node(int value, int distance, String path) {
            this.value = value;
            this.distance = distance;
            this.path = path;
        }
        public String toString() {
            return " Jarak antara " + this.value + " dari source, bernilai " + this.distance + " dan jalan yang di lalui adalah " + this.path;
        }
    }

    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int nodes = masuk.nextInt();
        int[][] graph = new int[nodes + 1][nodes + 1];
        int numEdges = masuk.nextInt();
        for (int edge = 0; edge < numEdges; edge++) {
            int x = masuk.nextInt(), y = masuk.nextInt(), w = masuk.nextInt();
            graph[x][y] = w;
        }
        bellmanford(masuk.nextInt(), nodes, numEdges, graph);
    }
 
    public static edge[] getEdges(int numEdges, int[][] graph) {
        edge[] rv = new edge[numEdges];
 
        int idx = 0;
        for (int x = 1; x < graph.length && idx < rv.length; x++) {
            for (int y = 1; y < graph[x].length && idx < rv.length; y++) {
                rv[idx] = new edge(x, y);
                idx = graph[x][y] != 0 ? idx + 1 : idx;
            }
        }
        return rv;
    }
 
    public static void bellmanford(int src, int nodes, int edges, int[][] graph) {
        //ngebikin hashmapnya
        HashMap<Integer, Node> nodesMap = new HashMap<>();
        
        for (int i = 1; i < graph.length; i++) {
            nodesMap.put(i, new Node(i, i == src ? 0 : (int) 1e9 + 1, i == src ? Integer.toString(i) : ""));
        }
     
}
