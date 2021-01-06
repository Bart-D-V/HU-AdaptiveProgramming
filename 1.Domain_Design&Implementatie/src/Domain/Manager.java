package Domain;

public class Manager implements LompeZak {
    String naam;
    String auto;
    double geldVerdient = 0.0;
    Stripclub club;

    public Manager(String nm, String auto) {
        this.naam = nm;
        this.auto = auto;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public void setAuto(String auto) {
        this.auto = auto;
    }

    public void setClub(Stripclub cB) {
        this.club = cB;
    }

    public void dikkeAuto() {
        System.out.println(naam + ": VROEM VROEM, ik heb een " + auto);
    }

    public void lekkerding() { System.out.println("Lekker werk dames!"); }

    public void maandSalaris() {
        geldVerdient += 0.50 * club.bankSaldo;
        club.bankSaldo -= 0.50 * club.bankSaldo;
        System.out.println(naam + " heeft deze maand " + geldVerdient + " euro verdient!");
    }

    @Override
    public String toString() {
        String result = naam + " heeft een " + auto + "\n";
        try{
            result += "en is de manager bij " + club + ", en heeft " + geldVerdient + ".";
        }catch (NullPointerException e){
            result += "en is werkloos.";
        }
        return result;
    }
}
