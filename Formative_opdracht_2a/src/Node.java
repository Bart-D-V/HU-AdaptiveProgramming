import java.util.Arrays;

public class Node {

    String state = "s0";
    String[] output = {"s0"};
    boolean error = false;

    public void f(String path) {
        for(int i = 0; i < path.length(); i++) {
            if (!error) {
                location(path.charAt(i));
            }
            else {
                break;
            }
        }
        System.out.println("route = " + Arrays.toString(output));
    }

    public void location(char path)  {
        switch (state) {
            case "s0":
                if (path == 'A') {
                    state = "s1";
                } else if (path == 'B') {
                    state = "s4";
                } else if (path != 'C'){
                    pathError(state, path);
                }
                updateOutput();
                break;
            case "s1":
            case "s6":
                if (path == 'A') {
                    state = "s5";
                }
                else if (path != 'C'){
                    pathError(state, path);
                }
                updateOutput();
                break;
            case "s2":
                if (path == 'A') {
                    state = "s6";
                } else if (path == 'B'){
                    state = "s1";
                } else {
                    pathError(state, path);
                }
                updateOutput();
                break;
            case "s3":
                if (path == 'A') {
                    state = "s0";
                } else if (path == 'B'){
                    state = "s2";
                } else if (path != 'C'){
                    pathError(state, path);
                }
                updateOutput();
                break;
            case "s4":
                if (path == 'A') {
                    state = "s7";
                } else if (path == 'B'){
                    state = "s6";
                } else {
                    pathError(state, path);
                }
                updateOutput();
                break;
            case "s5":
                if (path == 'A') {
                    state = "s4";
                } else if (path == 'B'){
                    state = "s2";
                } else {
                    pathError(state, path);
                }
                updateOutput();
                break;
            case "s7":
                if (path == 'A') {
                    state = "s0";
                } else if (path == 'B'){
                    state = "s3";
                } else if (path == 'C'){
                    state = "s6";
                }
                updateOutput();
                break;
        }
    }

    public void updateOutput() {
        output = Arrays.copyOf(output, output.length + 1);
        output[output.length - 1] = state;
    }

    public void pathError(String state, char route) {
        error = true;
        System.out.println("error bij locatie: " + state + ", geen locatie kunnen vinden voor: " + route);
    }
}
