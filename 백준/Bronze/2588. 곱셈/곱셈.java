import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 11:20
	// 종료 : 11:40
	// 소요 : 00:20
	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a,b;
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		a = Integer.parseInt( st.nextToken() );

		st = new StringTokenizer(br.readLine(), " "); 
		String bLen = st.nextToken();
		b = Integer.parseInt( bLen );
		
		int tmpOne = b;
		for(int i=0; i<bLen.length(); i++) {
			int tOne = tmpOne%10;
			tmpOne /= 10;
			bw.write( (a*tOne)+"\n" );
		}
		bw.write( (a*b) +"\n");
	
		br.close();
		bw.flush(); 
		bw.close();

	}
}
