import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
				
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

		StringBuilder sb = new StringBuilder();
		
		// i => 홀수 짝수 컨트롤
		for(int i=1; i<=N; i++) {
			int num = Integer.parseInt(br.readLine());

			if(i%2 != 0) { // 홀수
				maxHeap.offer(num); // 큰 수 부터 나옴
			}else { // 짝수
				minHeap.offer(num); // 작은 수 부터 나옴
			}

			// maxHeap에서 꺼낸값(중간값) 보다 minHeap에 들어온 값이 크면 swap			
			if(i != 1 && maxHeap.peek() > minHeap.peek() ) { 
				int fromMin = minHeap.poll();
				int fromMax = maxHeap.poll();
				maxHeap.offer(fromMin);
				minHeap.offer(fromMax);
			}
			
			sb.append(maxHeap.peek() + "\n");
		}
		System.out.println(sb);
	}
}