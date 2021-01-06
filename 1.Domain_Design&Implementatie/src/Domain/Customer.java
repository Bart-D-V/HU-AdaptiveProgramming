package Domain;

public class Customer implements LompeZak {
    String naam;
    int leeftijd;
    double bankSaldo;
    Stripper favStripper;

    public Customer(String nm, int lt, double bs) {
        this.naam = nm;
        this.leeftijd = lt;
        this.bankSaldo = bs;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setBankSaldo(double bankSaldo) { this.bankSaldo = bankSaldo; }

    public void setFavStripper(Stripper fS) {
        this.favStripper = fS;
    }

    public String getFavStripper() {
        return favStripper.getNaam();
    }

    public void lekkerding() { System.out.println("hooo, wat een lekkere wijven!"); }

    public void dikkeAuto() { System.out.println("Wat een dikke bak!"); }

    public String getNaam() {
        return naam;
    }

    @Override
    public String toString() {
        String result = naam + " is " + leeftijd + " jaar oud \n";
        try {
            result += "en zijn favorite stripper is " + favStripper.getNaam() + ".";
        }catch (NullPointerException e){
            result += "en zijn favorite stripper is onbekend.";
        }
        return result;
    }
}
