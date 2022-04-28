/**
* 124 나라에는 자연수만 존재한다.
* 모든 수를 표현할 때, 1,2,4만 사용한다.
* 1 > 2 > 4 > 
* 11 > 12 > 14 > 21 > 22 > 24 > 41 > 42 > 44
**/
class Solution {
    public String solution(int n) {
        String answer = "";
        
        // (1)인덱스화..?
        // n <= 500,000,000
        // 1글자 3 = 3개
        // 2글자 3*3 = 9개
        // 3글자 3*3*3 = 27개
        // 4글자 3^4 = 51개
        // ...
        // 9글자 3^9
        // 인덱스로 건너뛰기 계산해도 너무 큼
        
        // (2) 규칙이 있나?
        // 1, 2, 4, 
        // 11, 12, 14,
        // 21, 22, 24
        // 41, 42, 44
        // 111, 112, 114,
        // 121, 122, 124,
        // 211, ...
        // 몫이 있으면 나머지값 1이면 1, 2이면 2, 0이면 4
        // 몫이 없으면 끝냄
        
        // ex) n=14
        // 14/3 = 4 .. 2(2)
        // 4/3 = 1 .. 1(1)
        // 1/3 = 0 .. 1(1)
        
        // ex) n=3
        // 3/3 = 1 .. 0(4)
        // 1/3 = 0 .. 1(1) <- 없어야함
        
        // ex) n=6
        // 6/3 = 2 .. 0(4)
        // 2/3 = 0 .. 2(2) <- 1이어야함
        
        // 따라서 3의 배수라면 (나머지가 0이 나올때) 몫 -1 처리해줌
        
        int mok = n;        
        var num = new int[]{4,1,2};
        StringBuilder sb = new StringBuilder();
        while(mok!=0) {
            int r = mok % 3;
            mok /= 3;
            
            if(r==0) mok --;
            sb.append(num[r]);
        }

        return sb.reverse().toString();
    }
}
