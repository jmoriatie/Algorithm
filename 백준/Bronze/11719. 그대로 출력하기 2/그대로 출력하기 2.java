import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr = new String[100];

        int point = -1;
        for(int i=0; i<arr.length; i++){
            String s = br.readLine();
            arr[i] = s;
            if(s != null) {
                point = i;
            }
        }

        for(int i=0; i<=point; i++){
            System.out.println(arr[i]);
        }
    }
}