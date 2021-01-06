package Domain;

public class Stripclub {
    String naam;
    String happyHour;
    double bankSaldo;

    public Stripclub(String naam, String hh, double bs) {
        this.naam = naam;
        this.happyHour = hh;
        this.bankSaldo = bs;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setHappyHour(String happyHour) { this.happyHour = happyHour; }

    public void setBankSaldo(double bankSaldo) { this.bankSaldo = bankSaldo; }

    public String getNaam() {
        return naam;
    }
    @Override
    public String toString() {
        return "Club " + naam + " heeft om " + happyHour + " een happyhour";
    }
}
