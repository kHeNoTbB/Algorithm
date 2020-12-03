import java.util.*;
import java.io.*;
public class Main {
	static int stoi(String s) {
		return Integer.parseInt(s);
	}
	static class Node implements Comparable<Node>{
		String name;
		int kor, eng, math;
		Node(String name, int kor, int eng, int math) {
			this.name = name;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		@Override
		public int compareTo(Node o) { //this:현재객체, o:파라미터로 받은 객체
			//국어가 감소하는 순서
			if(o.kor==this.kor) {
				//영어 점수가 증가하는 순서
				if(this.eng==o.eng) {
					//수학이 감소하는 순서
					if(this.math==o.math) {
						//이름이 증가하는 순서로
						if((this.name).compareTo(o.name)>0) return 1;
						else return -1;
					} else if(this.math<o.math) return 1;
					else return -1;
				} else {
					return this.eng-o.eng;
				}
			}
			else if(this.kor<o.kor) return 1;
			else return -1;
		}
	}
	static StringTokenizer st;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Node> pq = new PriorityQueue<>();
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			pq.add(new Node(st.nextToken(), stoi(st.nextToken()), stoi(st.nextToken()), stoi(st.nextToken())));
		}
		StringBuilder sb = new StringBuilder();
		while(!pq.isEmpty()) {
			sb.append(pq.poll().name+"\n");
		}
		System.out.print(sb);
	}
}
