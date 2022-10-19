import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] timeLine = br.readLine().split(" ");
		String S = timeLine[0];
		String E = timeLine[1];
		String Q = timeLine[2];
		
		Set<String> beforeSave = new HashSet<>(); // 최초 id 저장
		Set<String> afterSave = new HashSet<>(); // ID 시간 저장
		
		while(true) {
			String logLine = br.readLine();
			if(logLine == null) {break;}
			
			String[] log = logLine.split(" ");
						
			String time = log[0]; 
			String id = log[1];
			
			// 시작시간 전 => 시작시간이 더 큼
			if(S.compareTo(time) >= 0) { 
				beforeSave.add(id);
			}
			
			// 미팅 종료보다 이후, 스트림 종료보다 이전 => 미팅이 더 작고, 스트림 종료 더 큼 
			if(E.compareTo(time) <= 0 && Q.compareTo(time) >= 0){
				afterSave.add(id);
			}
		}
		
		int count = 0;
		if(!beforeSave.isEmpty() || !afterSave.isEmpty()) {
			for(String id : beforeSave) {
				if(afterSave.contains(id)) {
					count++;
				}
			}	
		}
			
		System.out.println(count);
	}
}