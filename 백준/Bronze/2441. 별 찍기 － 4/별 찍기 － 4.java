import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void makeStar(int begin, int end){
        if(begin < 1) return;

        String star = "";
        for(int i=1; i<=end; i++){
            if(i > (end-begin)) star += "*";
            else star += " ";
        }
        if(!(begin == 1)) star += "\n";
        System.out.print(star);        
        makeStar(begin-1, end);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        makeStar(n, n);
    }
}