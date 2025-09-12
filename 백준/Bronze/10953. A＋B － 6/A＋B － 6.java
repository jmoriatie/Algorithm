import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static int plus(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = Integer.parseInt(br.readLine());
        for(int i=0; i<cnt; i++){
            String[] numbers = br.readLine().split(",");
            int n1 = Integer.parseInt(numbers[0]);
            int n2 = Integer.parseInt(numbers[1]);
            System.out.println(plus(n1, n2));
        }
    }
}