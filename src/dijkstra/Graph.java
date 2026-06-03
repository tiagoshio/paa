package dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Graph {

    private List<List<EdgeWithWeight>> adj;

    public Graph(int quantVertexes) {
        this.adj = new ArrayList<>(quantVertexes);
        for(int i = 0; i < quantVertexes; i++) {
            this.adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adj.get(source).add(new EdgeWithWeight(destination, weight));
        adj.get(destination).add(new EdgeWithWeight(source, weight));
    }

    public int getQuantVertexes() {
        return this.adj.size();
    }

    public List<List<EdgeWithWeight>> getAdj() {
        return this.adj;
    }
}