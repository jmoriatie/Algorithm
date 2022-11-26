import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

//1 1
//2 3
//3 4
//9 8
//5 2
public class Main {
	// 시작 : 10:05
	// 종료 : 10:08
	// 소요 : 00:03
	public static void main(String[] args) throws IOException { 
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String in;
		StringTokenizer st;
		
		while((in = br.readLine()) != null) {
			st = new StringTokenizer(in, " "); 
			int a = Integer.parseInt( st.nextToken() );
			int b = Integer.parseInt( st.nextToken() );
			bw.write( (a+b) + "\n" );
		}

		br.close();
		bw.flush(); 
		bw.close();

	}
}