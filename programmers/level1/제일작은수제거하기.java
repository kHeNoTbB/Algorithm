import java.util.*;
class Solution {
  public int[] solution(int[] arr) {
      if(arr.length==1) {
          int[] answer = {-1};
          return answer;
      }
      ArrayList<Integer> list = new ArrayList<>();
      int[] b = new int[arr.length];
      for(int i=0; i<b.length; i++) {
          b[i]=arr[i];
      }
      Arrays.sort(b);
      for(int i=0; i<arr.length; i++) {
          if(b[0]!=arr[i]) list.add(arr[i]);
      }
      //System.out.println(list);
      int[] answer = new int[list.size()];
      for(int i=0; i<list.size(); i++) {
          answer[i] = list.get(i);
      }
      return answer;
  }
}
