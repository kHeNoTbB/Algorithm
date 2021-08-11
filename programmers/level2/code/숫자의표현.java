class Solution {
  public int solution(int n) {
      int answer = 0;
      
      for(int i=1; i<=n; i++) {
          int res = i;
          for(int j=i+1; j<=(n%2==0?n/2:n/2+1); j++) {
              res += j;
              if(res>=n) break;
          }
          if(res==n) answer++;
      }
      return answer;
  }
}
