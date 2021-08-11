import java.util.*;
class Solution {
  public String solution(String s) {
      String str = "";
      List<Integer> list = new LinkedList<>();
      for(int i=0; i<s.length(); i++) {
          if(s.charAt(i)==' ') {
              list.add(Integer.parseInt(str));
              str = "";
          } else {
              str+=s.charAt(i);
          }
      }
      list.add(Integer.parseInt(str));
      Collections.sort(list);
      
      String answer = list.get(0)+" "+list.get(list.size()-1);
      return answer;
  }
}
