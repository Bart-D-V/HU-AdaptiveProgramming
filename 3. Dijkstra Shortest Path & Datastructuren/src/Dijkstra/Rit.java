package Dijkstra;

public class Rit extends Stap{
    private double modifier;

    public Rit(double weight, Reis startReis, Reis eindeReis, double modifier) {
        super(weight, startReis, eindeReis);
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}