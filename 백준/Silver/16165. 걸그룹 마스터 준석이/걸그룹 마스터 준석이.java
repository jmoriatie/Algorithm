import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] cnt = br.readLine().split(" ");
		int groupsCnt = Integer.parseInt(cnt[0]); // 그룹들
		int testCnt = Integer.parseInt(cnt[1]); // 문제들

		Map<String, MemberList> groups = new HashMap<>(); // 그룹명, 그룹

		// 그룹 저장
		while (groupsCnt > 0) {
			String groupName = br.readLine(); // 그룹명
			int memberCnt = Integer.parseInt(br.readLine()); // 멤버수
			
			List<String> members = new ArrayList<>();
			for (int i = 0; i < memberCnt; i++) { // 멤버저장
				members.add(br.readLine());
			}
			groups.put(groupName, new MemberList(members)); // 멤버리스트
			groupsCnt--;
		}

		// 문제풀기
		while (testCnt > 0) {
			String testScript = br.readLine();
			int testCase = Integer.parseInt(br.readLine());

			switch (testCase) {
			case 0: // 그룹명 => 멤버출력
				MemberList memberList1 = groups.get(testScript); // 맵에서 찾기
				for (String member : memberList1.getMembers()) { // 멤버리스트 출력
					System.out.println(member);
				}
				break;
			case 1: // 멤버명 => 그룹출력
				for (String group : groups.keySet()) {
					MemberList memberList2 = groups.get(group); // 그룹 먼저 찾고
					if (memberList2.isMemberEqual(testScript)) { // 멤버있으면 그룹 출력
						System.out.println(group);
						break;
					}
				}
				break;
			}
			testCnt--;
		}
	}
}

class MemberList {
	private List<String> members;

	public MemberList(List<String> members) {
		Collections.sort(members);
		this.members = members;
	}

	public boolean isMemberEqual(String memberName) { // 멤버네임이 같을경우
		return members.contains(memberName);
	}

	public List<String> getMembers() { // 멤버들 반환
		return members;
	}
}