import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int size = 0;
        String[] arr = new String[size];
        String[] tempArr;

        while (true){
            String s = br.readLine();
            if(s == null || s.isEmpty()) break;

            tempArr = arr;
            arr = new String[++size];

            if(tempArr.length != 0){
                for(int i=0; i< size-1; i++){
                    arr[i] = tempArr[i];
                }
            }
            arr[size-1] = s;
        }

        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}