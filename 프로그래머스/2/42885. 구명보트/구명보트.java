import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int l = 0;
        Arrays.sort(people);
        
        for(int r = people.length-1; r>=l; r--){
            if(people[r] + people[l] <= limit) l++;
            answer++;
        }
        

        return answer;
    }
}