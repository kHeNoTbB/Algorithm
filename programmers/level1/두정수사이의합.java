import java.util.*;

class Solution {
  public long solution(int a, int b) {
      long answer = 0;
      int A = a;
      int B = b;
      
      if(a>b) {
         A = b;
         B = a;
      }
      
      for(int i=A; i<=B; i++) {
          answer += i;
      }
      
      return answer;
  }
}