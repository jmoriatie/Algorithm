import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    static ArrayList<Integer>[] nodeList;
    static int[] visit;
    static int CNT = 0;

    public static void dfs(int R) {

        visit[R] = ++CNT; // 방문 순서를 담는다

        // node에 저장된 번호가 방문하지 않은 노드일 경우 재귀
        for (int node : nodeList[R]) {
            if (visit[node] == 0) {
                dfs(node);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]); // 노드
        int M = Integer.parseInt(line[1]); // 간선
        int R = Integer.parseInt(line[2]); // 정점

        visit = new int[N + 1];
        nodeList = new ArrayList[N+1];
        for(int i=1; i<=N; i++) {
            nodeList[i] = new ArrayList<Integer>();
        }

        for (int i = 0; i < M; i++) { // 간선 수만큼 반복
            String[] tmp = br.readLine().split(" ");
            int y = Integer.parseInt(tmp[0]);
            int x = Integer.parseInt(tmp[1]);
            nodeList[y].add(x);
            nodeList[x].add(y);
        }

        for(int i=1; i<=N; i++){
            Collections.sort(nodeList[i]);
        }

        dfs(R);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= N; i++) sb.append(visit[i]).append('\n');
        System.out.print(sb);
    }
}