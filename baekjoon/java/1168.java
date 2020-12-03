import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		for(int i=1; i<=N; i++) {
			list.add(i);
		}
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		int idx = 0;
		while(list.size()!=1) {
			idx += K-1;
			while(true) {
				if(idx<list.size()) break;
				idx -= list.size();
			}
			sb.append(list.get(idx)+", ");
			list.remove(idx);
		}
		sb.append(list.get(0)+">");
		System.out.print(sb);
	}
}
