package org.acme.graph.routing;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.acme.graph.model.Edge;
import org.acme.graph.model.Vertex;

public class PathNode {
    private double cost;
    private Edge reachingEdge = null;
    private boolean visited = false;
    Vertex vertex;

    public PathNode(){
    }

    public void setCost(double v) {
        this.cost = cost;
    }
    @JsonIgnore
    public double getCost() {
        return cost;
    }

    public void setReachingEdge(Object o) {
        this.reachingEdge = reachingEdge;
    }
    @JsonIgnore
    public Edge getReachingEdge() {
        return this.reachingEdge;
    }

    public void setVisited(boolean b) {
        this.visited = visited;
    }

    public boolean isVisited() {
        return visited;
    }
}
