import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<n; i++) {
            for (int j=0; j<n+i; j++) { // length
                if (i==0 && j==n-1) {
                    sb.append("*");
                } else if (i == n-1) {
                    sb.append("*");
                } else if(j == n-1-i || j == n-1+i){
                    sb.append("*");
                }else {
                    sb.append(" ");
                }
            }
            if (i<n-1) sb.append("\n");
        }
        System.out.println(sb);
    }
}