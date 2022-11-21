import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int N = Integer.parseInt(br.readLine());
		
		int div = 9901;
		int[][] dp = new int[N+1][3]; // 0번 줄은 사용X 
		
		Arrays.fill(dp[1], 1); // 첫줄은 기본 1
		
		for(int i=2; i<=N; i++) {
			dp[i][0] = ( dp[i-1][0] + dp[i-1][1] + dp[i-1][2] ) % div; //사자X
			dp[i][1] = ( dp[i-1][0] + dp[i-1][2] ) % div; //사자왼쪽
			dp[i][2] = ( dp[i-1][0] + dp[i-1][1] ) % div; //사자오른쪽
		}
		
		int result = ( dp[N][0] + dp[N][1] + dp[N][2] ) % div;
		System.out.println(result);
	}
}