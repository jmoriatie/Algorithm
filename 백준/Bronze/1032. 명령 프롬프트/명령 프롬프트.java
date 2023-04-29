import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        String command = br.readLine();
        if(count != 1) {
            //기준점
            StringBuilder sb = new StringBuilder(command);
            for (int i=0; i<count-1; i++) {
                String word = br.readLine();

                for(int j=0; j<word.length(); j++) {
                    if (sb.length() >= word.length()) {
                        if (sb.charAt(j) != word.charAt(j)) {
                            sb.setCharAt(j, '?');
                        }
                    } else {
                        sb.append('?');
                    }
                }
            }
            command = sb.toString();
        }

        System.out.println(command);
    }
}