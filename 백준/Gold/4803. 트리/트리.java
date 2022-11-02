import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	
	static boolean[] check;
	static boolean permit = true;
	static ArrayList<Integer>[] nodes;
	
	public static void dfs(int cur, int pre) {
		
		for(int node : nodes[cur]) {
			if(check[node]) { //순환구조
				if(node != pre) { // 이전에 들어온거랑 틀리면 
					permit = false;
				}	
			}
			else {
				check[node] = true;
				dfs(node, cur);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCase = 1;
		while(true) {
			String[] tmp = br.readLine().split(" ");
			int N = Integer.parseInt(tmp[0]);
			int M = Integer.parseInt(tmp[1]);
			
			if(N == 0) break; // 종료조건
			
			int count = 0;
			check = new boolean[N+1];
			nodes = new ArrayList[N+1];
			
			for(int i=0; i<=N; i++) {
				nodes[i] = new ArrayList<Integer>();
			}
			
			for(int i=0; i<M; i++) { // 간선만큼, 추가
				String[] line = br.readLine().split(" ");
				int v1 = Integer.parseInt(line[0]);
				int v2 = Integer.parseInt(line[1]);
				nodes[v1].add(v2);
				nodes[v2].add(v1);
			}
			
			for(int i=1; i<=N; i++) { // count check
				if(check[i]) continue; // 1차 거름
				
				permit = true;
				check[i] = true;
				dfs(i, 0);	
				
				if(permit) count++;
			}
			
			
			if(count > 1) {
				System.out.printf("Case %d: A forest of %d trees.\n", testCase, count);
			}
			else if(count == 1) {
				System.out.printf("Case %d: There is one tree.\n", testCase);
			}else {
				System.out.printf("Case %d: No trees.\n",testCase);
			}
			testCase++;
		}
	}
}