package domain;

public class Machine {
    String naam;
    String tekst;
    String startPunt;

    public void setTekstMachine(String tekst, String startPunt){
        this.tekst = tekst;
        this.startPunt = startPunt;
    }

    public void setKansMachine(String naam) {
        this.naam = naam;
    }

    public void tekstMachine() {
        System.out.println(TekstFSM.f(startPunt, tekst));
    }

    public void kansMachine() {
        System.out.println(naam + KansFSM.tweeSteenDobbel("s1"));
    }
}
