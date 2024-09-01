import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        
        int l = 0;
        int r = people.length - 1; // 마지막 인덱스
        // 큰애 작은애 비교 - 작은애 증가
        while(l <= r){
            if(people[r] + people[l] <= limit) l++;
            r--;
            answer++;
        }

        return answer;
    }
}