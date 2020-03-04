import java.util.*;
class Solution {
    /*
    * (1) Queue로 풀면 계속 넣고 빼고 많아져서 시간초과가 난다. ㅠ
    * (2) stack으로 푸는 방법은 생각한건 두가지다
    *     전부 스택에 넣고 빼면서 문자열 연산 or 짝이 안 맞는걸 stack에 넣는방법
    *     근데 당연히 두번째 방법이 간단할거같다..ㅋㅋ 첨에 더럽게 짰는데 for each를 활용하니 깔끔해졌다.
    *     마지막 if문도 return stack.isEmpty()?1:0; 으로 간단하게 표현할 수 있을 것 같다.
    */
    public int solution(String s) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if(!stack.isEmpty() && stack.peek()==c) stack.pop();
            else stack.push(c);
        }
        if(stack.isEmpty()) return 1;
        return 0;
    }
}
