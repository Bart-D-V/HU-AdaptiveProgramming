package Domain;

public class Stripper {
    String naam;
    double lengte;
    String cupmaat;
    int leeftijd;
    double geldVerdient = 0.0;
    Stripclub club;

    public Stripper(String nm, double lg, String  cm, int lt) {
        this.naam = nm;
        this.lengte = lg;
        this.cupmaat = cm;
        this.leeftijd = lt;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public void setCupmaat(String cupmaat) {
        this.cupmaat = cupmaat;
    }

    public void setLengte(double lengte) {
        this.lengte = lengte;
    }

    public void setClub(Stripclub sC) {
        this.club = sC;
    }

    public String getNaam() {
        return naam;
    }

    public void maandSalaris() {
        if (club.bankSaldo < 2000)
            System.out.println("er is niet genoeg geld verdient");
        else
            geldVerdient += 2000;
            club.bankSaldo -= 2000;
            System.out.println(naam + " heeft deze maand " + geldVerdient + " euro verdient.");
    }

    @Override
    public String toString() {
        String result = naam + " is " + leeftijd + ", heeft cupmaat " + cupmaat + " en is " + lengte + "m lang ";
        try{
            result += "werkt bij " + club.getNaam() + " en heeft " + geldVerdient + ".";
        }catch (NullPointerException e){
            result += "en is werkloos.";
        }
        return result;
    }
}
