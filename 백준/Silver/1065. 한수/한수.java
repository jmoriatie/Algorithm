import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {
	// 시작 : 11:00
	// 종료 : 11:00
	// 소요 : 00:00
	public static void main(String[] args) throws IOException  { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt( br.readLine() );
		
		int hanCnt = 0;
		for(int i=1; i<=num; i++) {
			int tempN = i;
			String tempS = tempN+"";
			
			if(tempS.length() == 1) {
				hanCnt++;
			}
			else { // 두 자리 수 이상이면 동일 숫자인지 확인 
				boolean chk = true;
				int plusN = Integer.parseInt( tempS.charAt(1)+"") - Integer.parseInt( tempS.charAt(0)+"" ) ;
				for(int j=0; j<tempS.length()-1; j++) {
					if( (Integer.parseInt( tempS.charAt(j+1)+"") - Integer.parseInt( tempS.charAt(j)+"" ) ) != plusN )
						chk = false;
				}
				if(chk == true) hanCnt++;
			}

		}
		bw.write(hanCnt+"");
		
				
		br.close();
		bw.flush(); 
		bw.close();
	}
}