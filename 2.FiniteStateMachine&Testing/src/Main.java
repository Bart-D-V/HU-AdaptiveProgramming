import domain.Machine;
class main {

    public static void main(String[] args) {
        Machine machine1 = new Machine();
        machine1.setTekstMachine("AABA", "s0");
        machine1.tekstMachine();

        Machine machine2 = new Machine();
        machine2.setTekstMachine("CBAABBAB", "s3");
        machine2.tekstMachine();

        Machine machine3 = new Machine();
        machine3.setTekstMachine("ACACAC", "s3");
        machine3.tekstMachine();

        Machine machine4 = new Machine();
        machine4.setKansMachine("worp1");
        machine4.kansMachine();

        Machine machine5 = new Machine();
        machine5.setKansMachine("worp2");
        machine5.kansMachine();
    }
}