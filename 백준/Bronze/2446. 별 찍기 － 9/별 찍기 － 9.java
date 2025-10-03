import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;

public class Main {

    public static void makeStar(int n) {
        StringBuilder sb = new StringBuilder();
        
        int size = 2*n; // 9

        for (int i=0; i<n; i++) {
            int start = i;
            int end = size-1-i;
            for (int j=0; j<end; j++) {
                if(j >= start)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            sb.append("\n");
        }
        for (int i=n-2; i>=0; i--) {
            int start = i;
            int end = size-1-i;
            for (int j=0; j<end; j++) {
                if(j >= start)
                    sb.append("*");
                else
                    sb.append(" ");
            }
            if (!(i == n-1))
                sb.append("\n");
        }
        System.out.print(sb);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        makeStar(n);
    }
}