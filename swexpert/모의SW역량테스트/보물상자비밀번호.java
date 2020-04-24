import java.io.*;
import java.util.*;

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken()); // 숫자개수
			int K = Integer.parseInt(st.nextToken()); // k번째로 큰 수

			Queue<Character> queue = new LinkedList<>();
			String str = br.readLine();
			for (char c : str.toCharArray()) {
				queue.add(c);
			}

			TreeSet<Integer> code = new TreeSet();
			for (int i = 0; i < 7; i++) {
				char tmp = queue.poll();
				queue.add(tmp);

				for (int j = 0; j < queue.size(); j++) {

					StringBuilder sb = new StringBuilder();
					for (int k = 0; k < N / 4; k++) { // 4분면
						char poll = queue.poll();
						sb.append(poll);
						queue.add(poll);
					}
					code.add(Integer.parseInt(sb.toString(), 16));
				}
			}
			int answer = 0;
			for (int i = 0; i < K; i++) answer = code.pollLast();
			System.out.println("#"+tc+" "+answer);
		}
	}
}
