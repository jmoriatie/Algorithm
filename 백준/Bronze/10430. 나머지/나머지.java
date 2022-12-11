//package back;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 11:06
	// 종료 : 11:10
	// 소요 : 00:04
	public static void main(String[] args) throws IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); 
		int a,b,c;
		
		a = Integer.parseInt( st.nextToken() );
		b = Integer.parseInt( st.nextToken() );
		c = Integer.parseInt( st.nextToken() );
		
		bw.write( ((a + b) % c) + "\n" ); 
		bw.write( (((a % c) + (b % c)) % c ) + "\n"); 
		bw.write( ((a * b) % c) + "\n"); 
		bw.write( (((a % c) * (b % c)) % c )+ "\n"); 
		
		br.close();
		bw.flush(); 
		bw.close();

	}
}
