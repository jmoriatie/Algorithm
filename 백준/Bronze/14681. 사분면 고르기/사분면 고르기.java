import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 13:10
	// 종료 : 13:15
	// 소요 : 00:05
	public static void main(String[] args) throws IOException { 

		// 비교 연산자 계산 문제로 지연됨
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		int x,y;
		x = Integer.parseInt( st.nextToken() );
		st = new StringTokenizer(br.readLine(), " "); 
		y = Integer.parseInt( st.nextToken() );

		if(x > 0 && y > 0) bw.write('1');
		else if(x < 0 && y > 0) bw.write('2');
		else if(x < 0 && y < 0) bw.write('3');
		else if(x > 0 && y < 0) bw.write('4');
		else bw.write('0');
		
	
		br.close();
		bw.flush(); 
		bw.close();

	}
}