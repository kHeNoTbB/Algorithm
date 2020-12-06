import java.io.*;
import java.util.*;
public class Main {
	static boolean FLAG;
	static class Node implements Comparable<Node>{
		public int idx;
		public int num;
		public int like;
		
		public Node(int idx, int num, int like) {
			this.idx = idx;
			this.num = num;
			this.like = like;
		}

		@Override
		public int compareTo(Node o) {
			//투표가 적으면 앞으로, 같으면 idx가 적은 순
			if(FLAG) {
				return this.num - o.num;
			} else {
				if(o.like == this.like)
					return this.idx - o.idx;
				return this.like-o.like;
			}
			
		}
		
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int K = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Node> list = new ArrayList<>();
		
		for(int k=0; k<K; k++) {
			int num = Integer.parseInt(st.nextToken());
            Boolean flag = true;
			for(Node n: list){
                if(num == n.num){
                    n.like++;
                    flag = false;
                    break;
                }
            }
			
            if(flag){
                if(list.size() == N){
                    Collections.sort(list);
                    list.remove(0);
                    list.add(new Node(k, num, 1));
                }
                else{
                    list.add(new Node(k, num, 1));
                }
            }
		}
		
		FLAG = true;
        Collections.sort(list);
		StringBuilder sb = new StringBuilder();
		for(Node n : list)
			sb.append(n.num).append(" ");
		System.out.print(sb);
	}
}
