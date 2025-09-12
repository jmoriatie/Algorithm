import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int plus(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");
        boolean bool = br.ready();
        while (bool) {
            int n1 = Integer.parseInt(numbers[0]);
            int n2 = Integer.parseInt(numbers[1]);
            System.out.println(plus(n1, n2));

            bool = br.ready();
            if(bool)numbers = br.readLine().split(" ");
        }
    }
}