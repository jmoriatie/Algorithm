import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 13:05
	// 종료 : 13:50
	// 소요 : 03:45
	public static void main(String[] args) throws IOException { 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num,ten,one,ans;
		
		StringTokenizer st = new StringTokenizer( br.readLine() );
		num = Integer.parseInt( st.nextToken() );
		
		int cnt = 0;
		int next = num;
		while(true) {
			ten = next/10;
			one = next%10;
			ans = ten+one;
			next = Integer.parseInt(one+""+(ans%10));
			cnt++;
			if(next == num) break;
		}
		bw.write(cnt+"");

		br.close();
		bw.flush(); 
		bw.close();

	}
}