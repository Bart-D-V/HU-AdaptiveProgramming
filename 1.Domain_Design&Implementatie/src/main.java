import Domain.*;

public class main {
    
    public static void main(String[] args) {
        
        Stripclub sc1 = new Stripclub("de geile hond", "21:00", 5000.00);
        Stripper s1 = new Stripper("Karen", 1.71, "d", 25);
        s1.setClub(sc1);
        Stripper s2 = new Stripper("Lara", 1.65, "b", 28);
        s2.setClub(sc1);
        Manager m1 = new Manager("Hans", "Mercedes Benz");
        m1.setClub(sc1);
        Customer c1 = new Customer("Lars", 40, 567.54);
        c1.setFavStripper(s2);
        Customer c2 = new Customer("Erik", 36, 767.21);
        c2.setFavStripper(s2);
        Visit v1 = new Visit("26 december", "21:00", 45.00);
        v1.setClub(sc1);
        v1.setVisitor(c1);
        Visit v2 = new Visit("27 december", "22:00", 25.50);
        v2.setClub(sc1);
        v2.setVisitor(c2);

        System.out.println(s1.toString());
        System.out.println(sc1);
        System.out.println(m1);
        System.out.println(c1);
        System.out.println(v1);
        v1.verrekening();
        v2.verrekening();
        s1.maandSalaris();
        s2.maandSalaris();
        m1.maandSalaris();
        c1.lekkerding();
        m1.lekkerding();
    }
}
