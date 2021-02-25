package Dijkstra;

import java.util.ArrayList;
import java.util.List;

public class Reis implements Comparable<Reis> {
    private String naam;
    private List<Stap> reizen;
    private boolean visited;
    private Reis vorigeReis;
    private double minDistance = Double.MAX_VALUE;

    public Reis(String naam) {
        this.naam = naam;
        this.reizen = new ArrayList<>();
    }

    public void addNeighbour(Stap stap) {
        this.reizen.add(stap);
    }

    public List<Stap> getReizen() {
        return reizen;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Reis getVorigeReis() {
        return vorigeReis;
    }

    public void setVorigeReis(Reis vorigeReis) {
        this.vorigeReis = vorigeReis;
    }

    public double getMinDistance() {
        return minDistance;
    }

    public void setMinDistance(double minDistance) {
        this.minDistance = minDistance;
    }

    @Override
    public String toString() {
        return naam;
    }

    @Override
    public int compareTo(Reis andereReis) {
        return Double.compare(this.minDistance, andereReis.minDistance);
    }
}