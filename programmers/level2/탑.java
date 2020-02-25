package programmers;

import java.util.Arrays;

public class 탑 {
	 public static int[] solution(int[] heights) {
	        int[] answer = new int[heights.length];
	        for(int i=heights.length-1; i>0; i--) {
	            for(int j=i-1; j>=0; j--) {
	                if(heights[i]<heights[j]) {
	                    answer[i] = j;
	                    break;
	                }
	            }
	        }
	        return answer;
	    }
	 public static void main(String[] args) {
		int[] heights = {6, 9, 5, 7, 4}; 
		int[] answer = solution(heights);
		System.out.println(Arrays.toString(answer));
	 }
}
