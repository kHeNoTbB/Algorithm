class Solution {
  public boolean solution(String s) {
      if(s.length()==4 || s.length()==6) {
          for(int i=0; i<s.length(); i++) {
              int a = s.charAt(i);
              if(a<48 || a>57) {
                  return false;
              }
          }
          return true;
      }
      return false;
  }
}
