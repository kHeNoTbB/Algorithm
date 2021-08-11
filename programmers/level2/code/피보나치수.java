class Solution {
  public int solution(int n) {
      int a = 0;
      int b = 1;
      for(int i=0; i<n; i++) {
          int c = (a+b)%1234567;
          a = b % 1234567;
          b = c % 1234567;
      }
      return a;
  }
}
