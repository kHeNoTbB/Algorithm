import java.util.*;
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] map = new int[n];
        
        for(int i=0; i<n; i++) {
            map[i] = arr1[i] | arr2[i];
        }
        
        //2진수로 나타낸 후, 1이면 # 0이면 공백
        for(int i=0; i<n; i++) {
            String binaryString = Integer.toBinaryString(map[i]);
            //앞에 0 붙여줘야함..
            int tmp = n-binaryString.length();
            for(int j=0; j<tmp; j++) binaryString = "0"+binaryString;
            StringBuilder sb = new StringBuilder();
            for(char c : binaryString.toCharArray()) {
                if(c=='0') sb.append(" ");
                else sb.append("#");
            }
            answer[i] = sb.toString();
        }
        return answer;       
    }
}
