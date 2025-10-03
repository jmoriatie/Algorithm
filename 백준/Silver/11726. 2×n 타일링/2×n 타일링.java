import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static Integer[] DP;
    public static int recur(int n) {
        if(n <= 0) return 0;
       if(DP[n] == null){
           DP[n] = (recur(n-1) + recur(n-2)) % 10007;
       }
        return DP[n];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        DP = new Integer[1001];
        DP[1] = 1;
        DP[2] = 2;
        System.out.println(recur(n));
    }
}