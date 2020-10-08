package pathfinder;

import model.BusStop;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private final BusStop busStop;
    private final List<Edge> edges;
    private boolean marked = false;
    private double cost = 0;

    public Node(BusStop busStop) {
        this.busStop = busStop;
        edges = new ArrayList<>();
    }

    public BusStop getBusStop() {
        return busStop;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void addEdge(Node tail, double weight) {
        edges.add(new Edge(tail, weight));
    }

    public void mark() {
        marked = true;
    }

    public void unmark() {
        marked = false;
    }

    public boolean isMarked() {
        return marked;
    }

    @Override
    public String toString() {
        return "Node{" +
                "busStop=" + busStop +
                '}';
    }
}
