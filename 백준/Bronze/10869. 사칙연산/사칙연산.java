//package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 11:04
	// 종료 : 11:05
	// 소요 : 00:01
	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		int a,b;
		
		a = Integer.parseInt( st.nextToken() );
		b = Integer.parseInt( st.nextToken() );
		
		bw.write((a + b)+"\n"); 
		bw.write((a - b)+"\n"); 
		bw.write((a * b)+"\n"); 
		bw.write((a / b)+"\n"); 
		bw.write((a % b)+"\n"); 
		
	
		br.close();
		bw.flush(); 
		bw.close();

	}
}
