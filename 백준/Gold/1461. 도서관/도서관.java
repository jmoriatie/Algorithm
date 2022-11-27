import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]); // 책개수
        int M = Integer.parseInt(str[1]); // 무게

        PriorityQueue<Integer> priorityQueuePositive = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> priorityQueueNegative = new PriorityQueue<>(Comparator.reverseOrder());

        String[] tmp = br.readLine().split(" ");

        int max = 0;
        for (int i = 0; i < N; i++) {
            int spot = Integer.parseInt(tmp[i]);

            if (spot > 0) {
                priorityQueuePositive.offer(spot);
            } else {
                priorityQueueNegative.offer(Math.abs(spot));
            }

            int absSpot = Math.abs(spot);
            if (absSpot > max) {
                max = absSpot;
            }
        }


        int result = 0;
        while (N != 0) {
            for (int i = 0; i < M; i++) {
                if (priorityQueuePositive.peek() != null) {
                    if (i == 0) result += priorityQueuePositive.poll()*2;
                    else priorityQueuePositive.poll();
                }
                if (priorityQueueNegative.peek() != null) {
                    if (i == 0) result += priorityQueueNegative.poll()*2;
                    else priorityQueueNegative.poll();
                }
            }
            N--;
        }
        result -= max;

        System.out.println(result);
    }
}