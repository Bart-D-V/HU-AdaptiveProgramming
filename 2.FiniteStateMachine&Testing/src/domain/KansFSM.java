package domain;

public class KansFSM {
    private static int random;
    private static String position;
    private static String[] paths;
    private static final String[] s1 = {"s2", "s3", "s4"};
    private static final String[] s2 = {"s5", "s6", "s1"};
    private static final String[] s3 = {"s7", "s8", "s9"};
    private static final String[] s4 = {"s10", "s11", "s1"};
    private static final String[] s5 = {"1 en 1", "1 en 2", "1 en 3"};
    private static final String[] s6 = {"1 en 4", "1 en 5", "1 en 6"};
    private static final String[] s7 = {"2 en 2", "2 en 3", "2 en 4"};
    private static final String[] s8 = {"2 en 5", "2 en 6", "3 en 3"};
    private static final String[] s9 = {"3 en 4", "3 en 5", "3 en 6"};
    private static final String[] s10 = {"4 en 4", "4 en 5", "4 en 6"};
    private static final String[] s11 = {"5 en 5", "5 en 6", "6 en 6"};


    public static String tweeSteenDobbel(String startPlek) {
        position = startPlek;
        while (position.length() < 4) {
            newpaths(position);
            newLocation(paths);
        }
        return(" heeft " + position + " gegooid.");
    }


    public static String[] newpaths(String location) {
        switch (location) {
            case "s1":
                paths = s1;
                break;
            case "s2":
                paths = s2;
                break;
            case "s3":
                paths = s3;
                break;
            case "s4":
                paths = s4;
                break;
            case "s5":
                paths = s5;
                break;
            case "s6":
                paths = s6;
                break;
            case "s7":
                paths = s7;
                break;
            case "s8":
                paths = s8;
                break;
            case "s9":
                paths = s9;
                break;
            case "s10":
                paths = s10;
                break;
            case "s11":
                paths = s11;
                break;
        }
        return(paths);
    }


    public static void newLocation(String[] paths) {
        randomNum();
        position = paths[random];
    }


    public static void randomNum() {
        random = (int) (Math.random() * 3);
    }
}
