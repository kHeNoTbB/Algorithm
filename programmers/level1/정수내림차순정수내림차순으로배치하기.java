class Solution {
  public long solution(long n) {
      String str = n + "";
      int[] num = new int[10];
      for(int i=0; i<str.length(); i++) {
          num[str.charAt(i)-'0']++;
      }
      String fin = "";
      for(int i=9; i>=0; i--) {
          for(int j=0; j<num[i]; j++) fin+=i+"";
      }
      long answer = Long.parseLong(fin);
      return answer;
  }
}
