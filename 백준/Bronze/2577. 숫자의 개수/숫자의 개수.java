import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	// 시작 : 09:20
	// 종료 : 09:35
	// 소요 : 00:15
	public static void main(String[] args) throws IOException { 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a,b,c;
		a = Integer.parseInt( br.readLine() );
		b = Integer.parseInt( br.readLine() );
		c = Integer.parseInt( br.readLine() );

		String mul = (a*b*c)+"";

		int check[] = new int[10];
		
		for(int i=0; i<mul.length(); i++) {
			int tmpN = Integer.parseInt(mul.charAt(i)+"");
			check[tmpN]++;			
		}
		for(int i=0; i<check.length; i++) {
			bw.write(String.format("%d\n", check[i]));
		}

		br.close();
		bw.flush(); 
		bw.close();
	}
}