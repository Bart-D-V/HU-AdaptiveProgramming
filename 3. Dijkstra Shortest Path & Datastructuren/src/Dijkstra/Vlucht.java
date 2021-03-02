package Dijkstra;

public class Vlucht extends Stap{
    private double modifier;

    public Vlucht(double weight, Reis startReis, Reis eindeReis, double modifier) {
        super(weight, startReis, eindeReis);
        this.modifier = modifier;
    }

    public double getModifier() {
        return modifier;
    }
}
