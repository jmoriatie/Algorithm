import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
	
	
	static boolean[] check;
	static ArrayList<Integer> visitedDfs;
	static ArrayList<Integer> visitedBfs;
	static ArrayList<Integer>[] nodes;
	
	public static void dfs(int node) {
		
		check[node] = true;
		visitedDfs.add(node);
		
		for(int v : nodes[node]) {
			if(!check[v]) {
				dfs(v);
			}
		}
	}
	
	public static void bfs(int node) {
		Queue<Integer> que = new LinkedList<>();
		
		que.offer(node);
		check[node] = true;
		
		while(!que.isEmpty()) {
			int nodeIdx = que.poll();
			visitedBfs.add(nodeIdx);
			
			for(int v : nodes[nodeIdx]) {
				if(!check[v]) {
					que.offer(v);
					check[v] = true;
				}
			}
		}	
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] tmp = br.readLine().split(" ");
		int N = Integer.parseInt(tmp[0]);
		int M = Integer.parseInt(tmp[1]);
		int V = Integer.parseInt(tmp[2]);
		
		check = new boolean[N+1];
		visitedDfs = new ArrayList<>();
		visitedBfs = new ArrayList<>();
		nodes = new ArrayList[N+1];
				
		for(int i=1; i<=N; i++) {
			nodes[i] = new ArrayList<>();
		}
		
		for(int i=1; i<=M; i++) {
			String[] line = br.readLine().split(" ");
			int v1 = Integer.parseInt(line[0]);
			int v2 = Integer.parseInt(line[1]);
			
			nodes[v1].add(v2);
			nodes[v2].add(v1);
		}
		
		for(int i=1; i<=N; i++) {
			nodes[i].sort(Comparator.naturalOrder());
		}
		
		dfs(V);
		check = new boolean[N+1]; //초기화
		bfs(V);
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<visitedDfs.size(); i++) {
			sb.append( visitedDfs.get(i) ).append(" ");
		}
		sb.append('\n');
		for(int i=0; i<visitedBfs.size(); i++) {
			sb.append( visitedBfs.get(i) ).append(" ");
		}
		System.out.println(sb);
	}
}