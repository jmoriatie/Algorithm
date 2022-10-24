import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<Integer> list  = new ArrayList<>();

        for(int i=0; i<count; i++){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                list.remove(list.size()-1);
            }else{
                list.add(num);
            }
        }

        int sum = list.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);
    }
}