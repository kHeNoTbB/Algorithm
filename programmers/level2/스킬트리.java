package programmers;

/*
 * 문자열의 길이는 .length()
 * 그 외 배열등의 길이는 .length
 */
public class 스킬트리 {
	class Solution {
	    public int solution(String skill, String[] skill_trees) {
	        int answer = 0;
	        loop:for(int i=0; i<skill_trees.length; i++) {
	            String test = skill_trees[i];
	            boolean[] ck = new boolean[skill.length()];
	            
	            for(int j=0; j<test.length(); j++) {    
	                char c = test.charAt(j);
	                for(int k=0; k<skill.length(); k++) {
	                    if(c!=skill.charAt(k)) continue;
	                    for(int l=k-1; l>=0; l--) {
	                        if(!ck[l]) {
	                            continue loop;  
	                        }
	                    }
	                    ck[k]=true;
	                }
	            }
	            answer ++;
	        }
	        return answer;
	    }
	}
}
