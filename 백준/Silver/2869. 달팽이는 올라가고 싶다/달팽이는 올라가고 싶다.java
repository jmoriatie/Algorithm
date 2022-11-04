import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		int up = Integer.parseInt(str[0]);
		int down = Integer.parseInt(str[1]);
		int goal = Integer.parseInt(str[2]);
		
		int day = (goal-down)/(up-down); // 당일 오전
		
		if((goal-down)%(up-down) != 0) {
			day++;
		}
		System.out.println(day);
	}
}