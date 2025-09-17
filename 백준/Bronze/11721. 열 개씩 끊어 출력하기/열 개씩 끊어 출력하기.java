import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        char[] charArray = s.toCharArray();
        int count = 1;
        for(int i=0; i<charArray.length; i++){
            System.out.print(charArray[i]);

            if(count == 10) {
                System.out.println();
                count = 0;
            }
            count++;
        }
    }
}