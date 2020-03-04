class Solution {
    static boolean[] visited;
    static int answer;
    public int solution(int[] numbers, int target) {
        visited = new boolean[numbers.length];
        com(0, numbers, target);
        
        return answer;
    }
    public void com(int c, int[] numbers, int target) {
        if(c==numbers.length) {
            int sum = 0;
            for(int i=0; i<visited.length; i++) {
                if(!visited[i]) sum+=numbers[i];
                else sum-=numbers[i];
            }
            if(sum==target)answer++;
            return;
        }
        
        com(c+1, numbers, target);
        visited[c]=true;
        com(c+1, numbers, target);
        visited[c]=false;
    }
    
}
