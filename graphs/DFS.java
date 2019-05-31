
// DEPTH FIRST SEARCH FOR A GRAPH
// The only catch here is, unlike trees, graphs may contain cycles, so we may
// come to the same node again. To avoid processing a node more than once, we
// use a boolean visited array.
import java.io.*;
import java.util.*;

class Graph {
    private int V; // No. of vertices
    private LinkedList<Integer> adj[];

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next;
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v) {
        boolean visited[] = new boolean[V];
        DSFUtil(v, visited);
    }
}