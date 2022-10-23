import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;


public class Main {

    public static void main(String[] args) throws IOException {
        // 첫줄 열의 갯수 표시
        // 카드 개수(3<= N <= 100), 가까이 가야할 값(10<= M <= 300,000)
        // 카드들 (card <= 100,000)
        // [카드들] 중 3개를 더해서 [가까이 가야할 값]에 가장 가까운 수를 출력

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        List<String> cards = Arrays.asList(br.readLine().split(" "));

        int max = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = Stream.of(cards.get(i), cards.get(j), cards.get(k)).mapToInt(Integer::parseInt).sum();
                    if (sum > max && sum <= M) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);
    }
}
