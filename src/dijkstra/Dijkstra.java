package dijkstra;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    private Graph graph;
    private boolean[] visited;
    private int[] distances;
    private String[] paths;
    private PriorityQueue<EdgeWithWeight> queue;

    public Dijkstra(Graph graph) {
        this.graph = graph;
        this.visited = new boolean[graph.getQuantVertexes()];
        this.distances = new int[graph.getQuantVertexes()];
        Arrays.fill(this.distances, Integer.MAX_VALUE);
        this.paths = new String[graph.getQuantVertexes()];
        queue = new PriorityQueue<>((a, b) -> a.weight() - b.weight());
    }

    public void resolve(int start) {
        this.distances[start] = 0;
        this.queue.add(new EdgeWithWeight(start, 0));
        Arrays.fill(this.paths, "%s".formatted(start));

        while(!this.queue.isEmpty()) {
            var current = this.queue.poll();

            if(this.visited[current.vertex()]) continue;

            for(var currNeighbor : this.graph.getAdj().get(current.vertex())) {
                int v = currNeighbor.vertex();
                int w = currNeighbor.weight();

                if(this.visited[v]) continue;

                if(this.distances[current.vertex()] + w < this.distances[v]) {
                    this.distances[v] = this.distances[current.vertex()] + w;
                    this.queue.add(new EdgeWithWeight(v, this.distances[v]));
                    this.paths[v] = this.paths[current.vertex()] + " -> " + v;
                }
            }

            this.visited[current.vertex()] = true;
        }

        this.showRes(start);
    }

    public void showRes(int start) {
        for(int i = 0; i < this.paths.length; i++) {
            IO.println("Caminho p/ " + i + "(Distância: " + this.distances[i] + ")" + ": " + this.paths[i]);
        }
    }
}