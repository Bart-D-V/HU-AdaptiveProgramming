package Dijkstra;

public class Treinrit extends Stap{
    private double modifier;

    public Treinrit(double weight, Reis startReis, Reis eindeReis, double modifier) {
        super(weight, startReis, eindeReis);
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}

