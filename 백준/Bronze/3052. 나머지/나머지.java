import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


//1
//2
//3
//4
//5
//6
//7
//8
//9
//10
public class Main {
	// 시작 : 09:40
	// 종료 : 10:00
	// 소요 : 00:00
	public static void main(String[] args) throws IOException { 
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0;
		int checkArr[] = null;
		
		
		String a;
		boolean go = false;
		while(( a = br.readLine() ) != null ) {
			int tempArr[] = null;
			int tmpN = Integer.parseInt( a ) % 42;
			if(cnt != 0) {
				go = true;
				tempArr = checkArr;
			}
			cnt++;
			checkArr = new int[cnt];
			if(go == true)  
				for(int i=0; i<tempArr.length; i++) checkArr[i] = tempArr[i];
			checkArr[cnt-1] = tmpN; 
		}
		
		int cc = 0;
		for(int i=0; i<checkArr.length; i++) {
			int chkCnt = 0;
			for(int j=i; j<checkArr.length; j++) {
				if(checkArr[i] == checkArr[j]) chkCnt++;
			}
			if(chkCnt == 1) cc++;
		}
		
		bw.write(cc+"");
		
		br.close();
		bw.flush(); 
		bw.close();
	}
}
