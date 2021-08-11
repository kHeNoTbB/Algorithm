
/* [회고]
    startIdx의 tmpIdx가 필요함
    이유는, 길이가 짧을 때만 갱신해줘야 함.
    for문에서 조건 만족 시, break 조건으로 탈출한다고 해서 무조건 최저길이가 아님.
    따라서 최저길이 발견 시, startIdx와 최저길이를 갱신해줘야 함     
*/
import java.util.*;

class Solution {
	public int[] solution(String[] gems) {

		Set<String> set = new HashSet<>();
		for (String gem : gems) {
			set.add(gem);
		}

		int len = 100000 + 1;
		int startIdx = 0;
		int tmpIdx = 0;
		Map<String, Integer> map = new HashMap<>();
		Queue<String> queue = new LinkedList<>();
		for (int i = 0; i < gems.length; i++) {
			map.put(gems[i], map.getOrDefault(gems[i], 0) + 1);
			queue.add(gems[i]);

			// 현재 머리가 두개이상이면, 머리를 자른다. (머리 중, 1개인 보석 발견할때까지 계속 자름)
			while (map.get(queue.peek()) > 1) {
				map.put(queue.peek(), map.get(queue.poll()) - 1);
				tmpIdx++;
			}

			// 다 담았는지? ★★★★
			if (map.size() == set.size() && len > i - tmpIdx) {
				len = i - tmpIdx;
				startIdx = tmpIdx + 1;

			}
		}

		return new int[] { startIdx, startIdx + len };
	}
}
