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
                double weight = (stap.getWeight() * stap.getModifier());

                minDistance = reis.getMinDistance() + weight;
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
