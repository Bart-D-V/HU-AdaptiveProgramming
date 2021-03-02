package Dijkstra;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Reis r1 = new Reis("A");
        Reis r2 = new Reis("B");
        Reis r3 = new Reis("C");
        Reis r4 = new Reis("D");
        Reis r5 = new Reis("E");
        Reis r6 = new Reis("F");
        Reis r7 = new Reis("G");

        r1.addNeighbour(new Rit(13, r1, r3, 0.7));
        r1.addNeighbour(new Vlucht(45, r1, r2, 0.3));

        r2.addNeighbour(new Vlucht(64, r2, r4, 0.3));
        r2.addNeighbour(new Treinrit(30, r2, r3, 1.4));

        r3.addNeighbour(new Rit(24, r3, r5, 0.7));
        r3.addNeighbour(new Treinrit(17, r3, r4, 1.4));

        r4.addNeighbour(new Vlucht(127, r4, r7, 0.3));
        r4.addNeighbour(new Treinrit(14, r4, r6, 1.4));

        r5.addNeighbour(new Rit(21, r5, r6, 0.7));
        r5.addNeighbour(new Rit(31, r5, r7, 0.7));

        r6.addNeighbour(new Vlucht(73, r6, r7, 0.3));
        r6.addNeighbour(new Treinrit(10, r6, r5, 1.4));

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.dijkstra(r1);

        System.out.println(dijkstra.getShortestPathTo(r7));


    }
}