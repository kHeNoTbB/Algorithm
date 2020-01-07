import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        while(true) {
            answer += n%10;
            n/=10;
            if(n/10==0) {
                answer += n%10;
                break;
            }
        }

        return answer;
    }
}
