import java.util.*;
class Solution {
  public String solution(String s) {
      char[] ch = s.toCharArray();
      Arrays.sort(ch);
      String answer = "";
      for(int i=ch.length-1; i>=0; i--)
          answer+=ch[i];
      
      return answer;
  }
}
