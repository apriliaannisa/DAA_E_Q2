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
}
