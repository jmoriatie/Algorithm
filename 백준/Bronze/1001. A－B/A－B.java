//package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 11:00
	// 종료 : 11:01
	// 소요 : 00:01
	public static void main(String[] args) throws IOException { 

		// 버퍼리더, 라이터, 스트링토크나이저의 이해부족으로 시간 지연
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		int a,b;
		a = Integer.parseInt( st.nextToken() );
		b = Integer.parseInt( st.nextToken() );
		bw.write((a - b)+"\n"); // \n의 유무에 따라, 정답과 오답이 갈음 ( \n 사용해주기 )
		
		
		br.close();
		bw.flush(); 
		bw.close();

	}
}
