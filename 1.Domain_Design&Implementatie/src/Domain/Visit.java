package Domain;

public class Visit {
    String dag;
    String uur;
    double geldUitgegeven;
    Stripclub club;
    Customer visitor;

    public Visit(String dag, String uur, double gU) {
        this.dag = dag;
        this.uur = uur;
        this.geldUitgegeven = gU;
    }

    public void setDag(String dag) {
        this.dag = dag;
    }

    public void setUur(String uur) { this.uur = uur; }

    public void setGeldUitgegeven(double geldUitgegeven) {
        this.geldUitgegeven = geldUitgegeven;
    }

    public void setClub(Stripclub cB) { this.club = cB; }

    public void setVisitor(Customer vt) {
        this.visitor = vt;
    }

    public void verrekening() {
        club.bankSaldo += geldUitgegeven;
        System.out.println( visitor + " heeft " + geldUitgegeven + " uitgevenen.");
    }

    @Override
    public String toString() {
        String result = "op " + dag + " is " + geldUitgegeven  + " uitgegeven door " + visitor + " bij club " + club + ".";
        if (uur.equals(club.happyHour)) {
            result += " Tijdens de happyhour!";
        } else result += " Niet tijdens de happyhour.";
        
        return result;
    }
}
