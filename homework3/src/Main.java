import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String input;
        /*while (true) {
            input = getString();
            if (input.equals("")) break;

            Bracket br = new Bracket(input);
            br.check();
        }
        Queue q = new Queue(5);
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        q.remove();
        q.remove();

        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.insert(80);
        while (!q.isEmpty()) {
            int n = q.remove();
            System.out.println(n);

        }*/
        input = getString();
        Reverse rev = new Reverse(input);
        rev.rev();
        System.out.println(rev.outPut());
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        return br.readLine();
    }


}
