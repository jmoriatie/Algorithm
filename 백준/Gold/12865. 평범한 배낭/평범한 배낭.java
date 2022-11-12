import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]); // 물품수
		int K = Integer.parseInt(tmp[1]); // 가용 무게

		int[][] dp = new int[N+1][K+1]; // 세로: 물품갯수 / 가로: 증가할 무게
		int[] W = new int[N+1]; // 물품 갯수만큼
		int[] V = new int[N+1];

		for(int i=1; i<=N; i++) { // 아이템 번호
			String[] line = br.readLine().split(" ");
			W[i] = Integer.parseInt(line[0]);
			V[i] = Integer.parseInt(line[1]);

			for(int j=1; j<=K; j++) { // 무게 늘어남
				dp[i][j] = dp[i-1][j];

				// 무게가 들어올 떄 이전 item의 가치랑 + 이전 무게의 최선책(부족한 무게만큼) 
				if(W[i] <= j && dp[i-1][j] < V[i] + dp[i-1][j - W[i]]) {
					dp[i][j] = V[i] + dp[i-1][j - W[i]]; // item 가치에 써놓은 최선책 더하기 
				}
				// 무게 남는 것
				// 남는무게의 가치 더하기
			}
		}
		System.out.println(dp[N][K]);
	}
}
