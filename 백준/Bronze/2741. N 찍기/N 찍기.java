import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 09:00
	// 종료 : 09:05
	// 소요 : 00:05
	public static void main(String[] args) throws IOException { 

		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		int num;
		num = Integer.parseInt( st.nextToken() );
		
		for(int i=1; i<=num; i++) {
			bw.write(i + "\n");
		}
		
		br.close();
		bw.flush(); 
		bw.close();

	}
}