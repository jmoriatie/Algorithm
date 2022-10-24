import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	// 시작 : 13:15
	// 종료 : 13:10
	// 소요 : 01:10
	public static void main(String[] args) throws IOException { 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int game, cnt, sum;
		String ox = "";
		game = Integer.parseInt( br.readLine() );
		
		int sumArr[] = null;
		
		for(int i=0; i<game; i++) {
			ox = br.readLine();
			sumArr =  new int[ox.length()] ;
			cnt = 0;
			for(int j=0; j<ox.length(); j++) {
				if(ox.charAt(j) == 'O') {
					cnt++;
					sumArr[j] = cnt; 
				}
				else if(ox.charAt(j) == 'X') {
					cnt = 0;
					sumArr[j] = cnt;
				}
			}
			
			sum = 0;
			for(int j=0; j<sumArr.length; j++) 
				sum += sumArr[j];
			
			bw.write(sum+"\n");
		}
		
		br.close();
		bw.flush(); 
		bw.close();
	}
}
