import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

    public static Integer[] DP;
    public static int recur(int x) {
        if(DP[x] == null){
            if(x % 6 == 0){
                DP[x] = Math.min(recur(x-1), Math.min(recur(x/3), recur(x/2))) + 1;
            } else if(x % 3 == 0){
                DP[x] = Math.min(recur(x/3), recur(x-1)) + 1;
            } else if(x % 2 == 0){
                DP[x] = Math.min(recur(x/2), recur(x-1)) + 1;
            } else{
                DP[x] = recur(x-1) + 1;
            }
        }
        return DP[x];
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(br.readLine());
        DP = new Integer[x+1];
        DP[0] = DP[1] = 0;
        System.out.print(recur(x));
    }
}