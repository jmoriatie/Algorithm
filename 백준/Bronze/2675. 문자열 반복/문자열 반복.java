import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	// 시작 : 14:15
	// 종료 : 14:25
	// 소요 : 00:10
	public static void main(String[] args) throws IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int wholeWord = Integer.parseInt( br.readLine() );
		
		for(int i=0; i<wholeWord; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			int wordCnt = Integer.parseInt( st.nextToken() );
			String word = st.nextToken();
			for(int j=0; j<word.length(); j++) {
				for(int k=0; k<wordCnt; k++) {
					bw.write(word.charAt(j)+""); 
				}
			}
			bw.write("\n");
		}

			
		br.close();
		bw.flush(); 
		bw.close();
	}
}