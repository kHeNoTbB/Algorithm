class Solution {
    public String solution(int[][] scores) {
        StringBuilder answer = new StringBuilder();
        
        for(int i=0; i<scores.length; i++) {
        	int mine = scores[i][i];    	
        	int score = 0;
        	int min = 101;
        	int max = -1;
            boolean flag = true;
        	for(int j=0; j<scores[i].length; j++) {
        		if(i!=j && mine == scores[j][i]) flag = false;
                min = Math.min(min, scores[j][i]);
                max = Math.max(max, scores[j][i]);
        		score += scores[j][i];
        	}
            
            //자기자신이라면? 유일한 최고점, 유일한 최저점은 제외
            if(flag && (min==mine || max==mine)) {
                score -= mine;
        		score /= (scores.length-1);
            } else {
                score /= (scores.length);
            }
            
        	if(score>=90) answer.append("A");
        	else if(score>=80) answer.append("B");
        	else if(score>=70) answer.append("C");
        	else if(score>=50) answer.append("D");
        	else answer.append("F");
        }
        return answer.toString();
    }
}
