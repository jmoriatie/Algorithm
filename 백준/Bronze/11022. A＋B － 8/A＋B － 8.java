import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 09:30
	// 종료 : 09:31
	// 소요 : 00:01
	public static void main(String[] args) throws IOException { 
		
		// br.write는 printf 처럼 쓸 수 없는 듯
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine()); 
		int cnt, a, b;
		cnt = Integer.parseInt( st.nextToken() );
		
		for(int i=1; i<=cnt; i++) {
			st = new StringTokenizer(br.readLine(), " "); 
			a = Integer.parseInt( st.nextToken() );
			b = Integer.parseInt( st.nextToken() );
			bw.write("Case #"+i+": " +a +" + "+b+" = "+(a+b) + "\n");
		}
		
		br.close();
		bw.flush(); 
		bw.close();

	}
}