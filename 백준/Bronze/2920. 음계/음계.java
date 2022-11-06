import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] str = br.readLine().split(" ");
		
		boolean in = true;
		boolean de = true;
		
		for(int i=0; i<str.length-1; i++) {
			int cur = Integer.parseInt(str[i]);
			int next = Integer.parseInt(str[i+1]);
			if(cur < next) de = false;
			else in = false;
		}
		
		if(in) {
			System.out.println("ascending");
		}
		if(de) {
			System.out.println("descending");
		}
		if(!in && !de) {
			System.out.println("mixed");
		}
		
	}
}