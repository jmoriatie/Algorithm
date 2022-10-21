import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] line = br.readLine().split(" ");
		int coinTypeCnt = Integer.parseInt(line[0]);
		int won = Integer.parseInt(line[1]);
		
		int[] coins = new int[coinTypeCnt]; 
		
		for(int i=coinTypeCnt-1; i>=0; i--) {
			coins[i] = Integer.parseInt(br.readLine()); 
		}
		
		int count = 0;
		int idx = 0;
		while(won != 0) {
			if(won >= coins[idx]) {
				won -= coins[idx];
				count++;
			}else {
				idx++;
			}
		}
		System.out.println(count);
	}
}