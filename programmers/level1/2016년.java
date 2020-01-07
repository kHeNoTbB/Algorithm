class Solution {
  public String solution(int a, int b) {
      String answer = "";
      
      int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
      String[] week = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};

      int total = 0;
      for(int i=0; i<a-1; i++) {
          total += day[i];
      }
      total += b-1;
      answer = week[total%7];
      
      return answer;
  }
}