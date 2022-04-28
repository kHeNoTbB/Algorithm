/**
* 기본적인 BFS문제임 그러나 간만에 풀으니 뭔가 코드가 지저분해보임
* 에디터 사용안하다보니 queue.add() 헷갈림 (이걸..?)
* 코드 실행 시, main 에러나서 뭔가 했더니 boolean을 Boolean으로 오타라니 정말 창피함.. (아무튼 오타 조심할 것) 
**/
import java.util.*;
class Solution {
    
    public static class Node {
        int r;
        int c;
        Node(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
    
    public int[] solution(int m, int n, int[][] picture) {
        
        int numberOfArea = 0;
        int maxSizeOfOneArea = 0;
        int area = 0;
        
        int[] dr = {1,-1,0,0};
        int[] dc = {0,0,1,-1};
        
        //BFS
        var visited = new boolean[m][n];
        for(int i=0; i<picture.length; i++) {
            for(int j=0; j<picture[i].length; j++) {
                if(!visited[i][j] && picture[i][j]>0) {
                    area = picture[i][j];
                    numberOfArea++;
                    int tmpmaxSizeOfOneArea = 1;
                    Queue<Node> queue = new LinkedList<>();
                    queue.add(new Node(i,j));
                    
                    while(!queue.isEmpty()) {
                        Node poll = queue.poll();
                        visited[poll.r][poll.c] = true;
                        
                        for(int d=0; d<4; d++) {
                            int nr = poll.r + dr[d];
                            int nc = poll.c + dc[d];
                            
                            if(nr>=0 && nc>=0 && nr<m && nc<n && !visited[nr][nc] && picture[nr][nc] == area) {
                                visited[nr][nc] = true;
                                tmpmaxSizeOfOneArea++;
                                queue.add(new Node(nr, nc));
                            }
                        }   
                    }
                    
                    maxSizeOfOneArea = Math.max(maxSizeOfOneArea, tmpmaxSizeOfOneArea);
                    
                }
            }
        }
        
        

        int[] answer = new int[2];
        answer[0] = numberOfArea;       //몇개의 영역이 있는지
        answer[1] = maxSizeOfOneArea;   //가장 큰 영역의 넓이
        return answer;
    }
}
