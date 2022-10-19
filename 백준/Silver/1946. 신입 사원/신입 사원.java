import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

    static class TestMan implements Comparable<TestMan>{
        public int fir;
        public int sec;

        public TestMan(int fir, int sec){
            this.fir = fir;
            this.sec = sec;
        }

        @Override
        public int compareTo(TestMan man){
            if(this.fir > man.fir){
                return 1;
            }else{
                return -1;
            }
        }
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCnt = Integer.parseInt(br.readLine());

        for(int i=0; i<testCnt; i++){
            int testerCnt = Integer.parseInt(br.readLine());

            ArrayList<TestMan> arr = new ArrayList<>();

            // 넣고
            for(int j=0; j<testerCnt*2; j+=2){
                String[] stringArray = br.readLine().split(" ");
                TestMan man = new TestMan( Integer.parseInt(stringArray[0]), Integer.parseInt(stringArray[1]) );
                arr.add(man);
            }

            // 섞고
            Collections.sort(arr);

            // 순위 정렬
            int ans = 1;
            int minScore = arr.get(0).sec;
            for(int k=1; k<testerCnt; k++){

                if(arr.get(k).sec < minScore){
                    ans++;
                    minScore = arr.get(k).sec;
                }
            }
            System.out.println(ans);
        }
        

    }
}