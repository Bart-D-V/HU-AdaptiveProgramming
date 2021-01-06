package domain;

import java.util.Arrays;

public class TekstFSM {

    private static String state;
    private static String[] output;
    private static String error = null;


    public static String f(String startPunt, String path) {
        state = startPunt;
        output = new String[]{state};
        for(int i = 0; i < path.length(); i++) {
            if (error == null) {
                location(path.charAt(i));
            }
            else {
                break;
            }
        }
        if (error == null) {
            return(path + " bezocht locaties " + Arrays.toString(output));
        } else {
            return(error);
        }
    }

    public static void location(char path)  {
        switch (state) {
            case "s0":
                if (path == 'A') {
                    state = "s1";
                } else if (path == 'B') {
                    state = "s4";
                } else if (path != 'C'){
                    pathError(state, path);
                }
                break;
            case "s1":
            case "s6":
                if (path == 'A') {
                    state = "s5";
                }
                else if (path != 'C'){
                    pathError(state, path);
                }
                break;
            case "s2":
                if (path == 'A') {
                    state = "s6";
                } else if (path == 'B'){
                    state = "s1";
                } else {
                    pathError(state, path);
                }
                break;
            case "s3":
                if (path == 'A') {
                    state = "s0";
                } else if (path == 'B'){
                    state = "s2";
                } else if (path != 'C'){
                    pathError(state, path);
                }
                break;
            case "s4":
                if (path == 'A') {
                    state = "s7";
                } else if (path == 'B'){
                    state = "s6";
                } else {
                    pathError(state, path);
                }
                break;
            case "s5":
                if (path == 'A') {
                    state = "s4";
                } else if (path == 'B'){
                    state = "s2";
                } else {
                    pathError(state, path);
                }
                break;
            case "s7":
                if (path == 'A') {
                    state = "s0";
                } else if (path == 'B'){
                    state = "s3";
                } else if (path == 'C'){
                    state = "s6";
                }
                break;
        }
        updateOutput(state);
    }

    public static void updateOutput(String state) {
        output = Arrays.copyOf(output, output.length + 1);
        output[output.length - 1] = state;
    }

    public static void pathError(String state, char route) {
        error = "error bij locatie: " + state + ", geen pad kunnen vinden voor: " + route;
    }
}
