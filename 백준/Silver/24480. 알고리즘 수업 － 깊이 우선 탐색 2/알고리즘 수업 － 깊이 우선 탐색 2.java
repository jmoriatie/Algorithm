import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	

	private static int count = 0;
	private static int[] visit;
	private static ArrayList<Integer>[] nodes;
	
	public static void dfs(int node) {
		
		visit[node] = ++count;
		
		for(int num : nodes[node]) {
			if(visit[num] == 0) {
				dfs(num);
			}
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		int R = Integer.parseInt(tmp[2]);
		
		visit = new int[N+1];
		nodes = new ArrayList[N+1];
		
		for(int i=1; i<=N; i++) {
			nodes[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			String[] line = br.readLine().split(" ");
			int y = Integer.parseInt(line[0]);
			int x = Integer.parseInt(line[1]);
			
			nodes[y].add(x);
			nodes[x].add(y);
		}
		
		for(int i=1; i<=N; i++) {
			nodes[i].sort(Comparator.reverseOrder());
		}
		
		dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(visit[i]).append('\n');
        System.out.print(sb);
	}
}