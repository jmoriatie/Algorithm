import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void printNumber(int n, int gugu) {
        if (gugu == 10) {
            return;
        }
        System.out.printf("%d * %d = %d%n", n, gugu,n * gugu);
        printNumber(n, gugu+1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        printNumber(Integer.parseInt(br.readLine()), 1);
    }
}