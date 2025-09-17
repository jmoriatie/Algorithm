import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	// 시작 : 13:45
	// 종료 : 13:50
	// 소요 : 00:05
	public static void main(String[] args) throws IOException  { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = Integer.parseInt( br.readLine() );
		
		String num = br.readLine();
		int sum = 0;
		for(int i=0; i<cnt; i++) {
			sum += Integer.parseInt( num.charAt(i)+"" );
		}
				
		bw.write(sum+"");
		
				
		br.close();
		bw.flush(); 
		bw.close();
	}
}