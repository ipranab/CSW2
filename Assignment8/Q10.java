import java.util.*;

public class Q10 {
    private int V;
    private LinkedList<Integer> adj[];
    BFSGraphTraversal(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }
    void addEdge(int v, int w) {
        adj[v].add(w);
    }
    void BFS(int s) {
        boolean visited[] = new boolean[V];
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        visited[s] = true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[]) {
        BFSGraphTraversal g = new BFSGraphTraversal(4);
        g.addEdge(1, 1);
        g.addEdge(4, 2);
        g.addEdge(5, 2);
        g.addEdge(3, 0);
        g.addEdge(1, 3);
        g.addEdge(0, 3);

        System.out.println("BFS traversal starting from vertex 5:");
        g.BFS(5);
    }
}
