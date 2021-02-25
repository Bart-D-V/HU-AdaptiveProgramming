package Dijkstra;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

    public void dijkstra(Reis beginReis) {
        beginReis.setMinDistance(0);
        PriorityQueue<Reis> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(beginReis);

        while (!priorityQueue.isEmpty()) {
            Reis reis = priorityQueue.poll();

            for (Stap stap : reis.getReizen()) {
                Reis v = stap.getEindeReis();
//                Reis u = stap.getStartReis();
                double minDistance = 0;
                double weight = 0;

                if (stap.getType() instanceof Rit) {
                    weight = (stap.getWeight() * Rit.getModifier());
                } else if (stap.getType() instanceof Treinrit) {
                    weight = (stap.getWeight() * Treinrit.getModifier());
                } else if (stap.getType() instanceof Vlucht) {
                    weight = (stap.getWeight() * Vlucht.getModifier());
                } else {
                    weight = stap.getWeight();
                }

                minDistance = reis.getMinDistance() + weight;
                System.out.println(reis.compareTo(v));
                if (reis.compareTo(v) == -1) {
                    priorityQueue.remove(reis);
                    v.setVorigeReis(reis);
                    v.setMinDistance(minDistance);
                    priorityQueue.add(v);
                }
            }
        }
    }

    public List<Reis> getShortestPathTo(Reis eindeReis) {
        List<Reis> path = new ArrayList<>();

        for (Reis reis = eindeReis; reis != null; reis = reis.getVorigeReis()) {
            path.add(reis);
        }

        Collections.reverse(path);
        return path;
    }
}
