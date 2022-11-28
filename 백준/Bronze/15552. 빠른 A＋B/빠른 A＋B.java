
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 15:05
	// 종료 : 15:10
	// 소요 : 00:05
	public static void main(String[] args) throws IOException { 

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		int cnt, a, b;
		cnt = Integer.parseInt( st.nextToken() );
		
		int start = 1;
		while(start <= cnt) {
			st = new StringTokenizer(br.readLine(), " "); 
			a = Integer.parseInt( st.nextToken() );
			b = Integer.parseInt( st.nextToken() );
			bw.write( (a+b) + "\n");
			start++;
		}
		
		br.close();
		bw.flush(); 
		bw.close();

	}
}
