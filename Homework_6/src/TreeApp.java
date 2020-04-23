import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class TreeApp {
    public static void main(String[] args) throws IOException {
        int value;
        Random rnd = new Random();
        Tree theTree[] = new Tree[20];
        for (int i = 0; i < 20; i++) {
            theTree[i] = new Tree();
            for (int j = 0; j < 6; j++) {
                theTree[i].insert(new Number(rnd.nextInt(1 + 200)-100,j));
            }
        }
    }

}
