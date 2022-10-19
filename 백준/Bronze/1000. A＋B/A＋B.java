import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 09:40
	// 종료 : 00:00
	// 소요 : 00:00
	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " "); 
		int a,b;
		a = Integer.parseInt( st.nextToken() );
		b = Integer.parseInt( st.nextToken() );
		bw.write((a + b) + "\n"); 
		
		
		br.close();
		bw.flush(); 
		bw.close();

	}
}