import java.util.*;
class Solution {
    public String solution(int[] numbers) {
        
        String[] str = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            str[i] = numbers[i]+"";
        }
        
        Arrays.sort(str, new Comparator<String>() {
            public int compare(String str1, String str2) {
                //(1) int 비교
                //int s1 = Integer.parseInt(str1+str2);
                //int s2 = Integer.parseInt(str2+str1);
                //if(s1<=s2) return +1;                
                //else return -1;
                
                //(2) string 비교
                //양수를 리턴한 경우에는 두 객체의 자리가 바뀐다.
                //따라서 뒤에있는 수가 더 큰 경우 자리를 바꿔주기 위해 양수를 리턴해야 한다.
                //x.compareTo(y) 의 경우 x를 y와 비교한 수를 리턴한다.
                //x=3, y=4의 경우 -1이 리턴된다. (x가 y보다 작은 수)
                //근데 나는  큰수가 앞, 작은수가 뒤로 할거니까!
                return (str2+str1).compareTo(str1+str2);
            }
        });
        
        //System.out.println(Arrays.toString(str));       
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<str.length; i++) {
            answer.append(str[i]);
        }
        
        return !str[0].equals("0")?answer.toString():"0";
    }
}
