/*
[회고]
  1. getIntersection 이 함수에서 list2를 tmp로 안옮기고 그냥 연산한 부분
  2. 처음에 getIntersection 함수에서 for문으로 돌리면서 boolean 비교하면서 돌렸는데 런타임 난 이유? 뭔가 idx가 안맞았던 것 같음
*/
import java.util.*;
class Solution {
    public int solution(String str1, String str2) {
		int answer = 0;
		
		//(1)모두 소문자 변경
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		//(2)두글자씩 떼기, a-z 범위에 없으면 버린다.
		List<String> list1 = split(str1);
		List<String> list2 = split(str2);
		
		//(3)교집합
		double B = getIntersection(list1,list2);
        
		//(4)합집합
		double A = list1.size()+list2.size()-B;
        
        if(list1.size()==0 && list2.size()==0) return 65536;
		return (int)((B/A)*65536);
	}
	public List<String> split(String str) {
		List<String> result = new ArrayList<>();
		
		for(int i=0; i<str.length()-1; i++) {
			char a = str.charAt(i);
			char b = str.charAt(i+1);
			
			if((a >= 'a' && a<= 'z') && (b >= 'a' && b<= 'z')) {
				result.add(Character.toString(a)+Character.toString(b));
			}
		}
		
		return result;
	}
    
	public int getIntersection(List<String> list1, List<String> list2) {
        List<String> result = new ArrayList<>();
        List<String> tmp = new ArrayList<>(list2);
        
        for (String str: list1) {
            if (tmp.remove(str)) {
                result.add(str);
            }
        }
        
        return result.size();
    }
}
