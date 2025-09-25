import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

    public static void printStar(int idx, int end){
        if(idx == end) return;

        String s = "";
        for(int i=1; i<=idx; i++) s+="*";
        
        if(!(idx == end-1)) s+="\n";
        System.out.print(s);
        
        printStar(idx+1, end);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        printStar(1, n+1);
    }
}