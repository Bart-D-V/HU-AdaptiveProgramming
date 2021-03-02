package Dijkstra;


public class Stap {
    private double weight;
    private Reis startReis;
    private Reis eindeReis;

    public Stap(double weight, Reis startReis, Reis eindeReis) {
        this.weight = weight;
        this.startReis = startReis;
        this.eindeReis = eindeReis;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setStartReis(Reis startReis) {
        this.startReis = startReis;
    }

    public Reis getStartReis() {
        return startReis;
    }

    public void setEindeReis(Reis eindeReis) {
        this.eindeReis = eindeReis;
    }

    public Reis getEindeReis() {
        return eindeReis;
    }

    public double getModifier() { return 1.0;}
}
