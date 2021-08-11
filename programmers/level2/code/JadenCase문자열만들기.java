class Solution {
  /*
  * 8번 테스트케이스 : split("")으로 처리하면 뒤에 공백이 잘린다. hello_world!_의 경우 ['hello', 'world!']로 뒤 공백이 잘린다.
  * 근데 하필 8번 테스트케이스는 뒤에 공백이 있는 문자열로 hello_world!_ 를 Hello_World!_ 로 처리해야 하기 때문에
  * 뒤에 공백을 넣어주는 예외처리를 해줘야 했다. 
  * ['Hello', 'World!', ''] : Answer is ... "Hello_World!_"
  */
  
  public String solution(String s) {
      s = s.toLowerCase();
      String answer = "";
      String[] str = s.split(" ");
      int len = s.length();
      int len2 = 0;
      for(int i=0; i<str.length; i++) {
          len2 += str[i].length();
          if(str[i].equals(""))continue;
          if(str[i].charAt(0)>=97 && str[i].charAt(0)<=122) {
              char c = (char)(str[i].charAt(0) - 32);
              String tmp = c+"";
              for(int j=1; j<str[i].length(); j++) {
                  tmp += str[i].charAt(j);
              }
              str[i] = tmp;
          }
      }
      len2 += str.length-1;
      for(int i=0; i<str.length; i++) {
          answer += str[i];
          if(i!=str.length-1 || len2!=len) answer+=" ";
      }
      return answer;
  }
}
