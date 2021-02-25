package Dijkstra;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reis v1 = new Reis("A");
        Reis v2 = new Reis("B");
        Reis v3 = new Reis("C");

        v1.addNeighbour(new Stap<Rit>(1, v1, v2));
        v1.addNeighbour(new Stap<Vlucht>(10, v1, v2));

        v2.addNeighbour(new Stap<Treinrit>(1, v2, v3));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(v1);

        System.out.println(dijkstra.getShortestPathTo(v3));
    }
}