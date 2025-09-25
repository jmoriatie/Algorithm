import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void makeStar(int idx, int end){
        if(idx > end) return;

        String star = "";
        for(int i=1; i<=end; i++){
            if(i > (end - idx)) star += "*";
            else star += " ";
        }
        if(!(idx == end)) star += "\n";
        System.out.print(star);
        
        makeStar(idx+1, end);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        makeStar(1, n);
    }
}