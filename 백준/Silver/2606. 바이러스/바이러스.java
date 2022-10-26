import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	private static boolean[][] link; 
	private static boolean[] visit;
	private static int m, n;
	private static int count = 0;
	
	public static int dfs(int virus) {
		// 종료조건에 집착하지 말자
		visit[virus] = true; // 연계감염 => 들어오자마자 감염여부 체크
		
		for(int i=1; i<=m; i++) { // 노드 수 만큼 돈다
			// 1을 시작으로 감연된 애들은 차례대로 감염
			if(link[virus][i] && !visit[i]) { // 연결된 컴 && 감염체크 안돼있을 경우 
				count++; // 얘는 확실하니까
				dfs(i); // 해당 노드를 탐색하면서 감염여부 체크
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		m = Integer.parseInt(br.readLine()); // 노드 수 
		n = Integer.parseInt(br.readLine()); // 간선 수

		link = new boolean[m+1][m+1]; // 연결+1은 노드 수와 동일하도록
		visit = new boolean[m+1]; // 방문체크
		
		for(int i=0; i<n; i++) { // 연결 수만큼 돌기
			String[] tmp = br.readLine().split(" ");
			int y = Integer.parseInt(tmp[0]); 
			int x = Integer.parseInt(tmp[1]);
			link[y][x] = link[x][y] = true; // 쌍방연결 표현 
		}
		
		System.out.println( dfs(1) );
	}
}