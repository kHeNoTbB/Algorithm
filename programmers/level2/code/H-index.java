class Solution {
    public int solution(int[] citations) {
        for(int h=citations.length; h>=0; h--) {
            int a = 0;
            for(int i=0; i<citations.length; i++) {
                if(citations[i]>=h)  {
                    a++;
                }
            }
            if(a>=h) return h;
        }
        return 0;
    }
}
