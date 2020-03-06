import java.util.*;
public class Main {
	static int answer;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.nextLine().trim();
		int S = Integer.parseInt(num.split(" ")[1]);
		String[] arr = sc.nextLine().split(" ");
		boolean[] visited = new boolean[arr.length];
		powerSet(0, S, arr, visited);
		System.out.println(answer);
	}
	public static void powerSet(int idx, int S, String[] arr, boolean[] visited) {
		if(idx==arr.length) {
			int sum = 0;
			boolean flag = false;
			for(int i=0; i<visited.length; i++) {
				if(!visited[i]) {
					flag = true;
					sum+=Integer.parseInt(arr[i]);
				}
			}
			if(sum==S && flag) answer++;
			return;
		}
		visited[idx] = true;
		powerSet(idx+1, S, arr, visited);
		visited[idx] = false;
		powerSet(idx+1, S, arr, visited);
		
	}
}
