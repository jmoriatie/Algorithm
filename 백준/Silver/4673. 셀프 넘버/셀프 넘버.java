public class Main {
	// 시작 : 09:40
	// 종료 : 10:25
	// 소요 : 00:35
	public static void main(String[] args)  { 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		boolean selfNum[] = new boolean[10001];
		
			
		// 더해지는 건 빼버려, 안 더해지는 것만 출력할거
		for(int i=1; i<selfNum.length; i++) {
			int tempN = i;
			String tempS = tempN+"";
			for(int j=0; j<tempS.length(); j++) {
				tempN += Integer.parseInt( tempS.charAt(j)+"" );
			}
			if(tempN > 10000) continue; // 10000 넘는 수는 그냥 넘어가
			else selfNum[tempN] = true; // 나중에 없는 인덱스 번호를 출력하기 위함
		}
		
		// 안 더해진 것만 출력
		for(int i=1; i<selfNum.length; i++) {
			if(selfNum[i] == false) {
				System.out.println(i);
			}
		}
				
//		br.close();
//		bw.flush(); 
//		bw.close();
	}
}