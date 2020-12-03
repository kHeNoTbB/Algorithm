import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	static int[] parents;
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int[][] map = new int[N][N];
		int[][] node = new int[(N*N-N)/2][3];
		parents = new int[N];
		
		for(int i=0; i<N; i++) {
			parents[i]=i;
		}
		
		
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		
		int n=0;
		for(int i=0; i<N; i++) {
			for(int j=i+1; j<N; j++) {
				node[n][0] = i;
				node[n][1] = j;
				node[n][2] = map[i][j];
				n++;
			}
		}
		
		Arrays.sort(node, new Comparator<int[]> () {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[2]-o2[2];
			}
			
		});
		
		int cnt=0;
		long sum=0;
		for(int i=0; i<node.length; i++) {
			if(findset(node[i][0])!=findset(node[i][1])) {
				unionset(node[i][0], node[i][1]);
				cnt++;
				sum+=node[i][2];
				
				if(cnt==N-1) break;
			}
		}
		//System.out.println(cnt);
		System.out.println(sum);
		
	}
	static int findset(int x) {
		if(parents[x]==x) return x;
		return parents[x]=findset(parents[x]);
	}
	
	static void unionset(int x, int y) {
		int px = findset(x);
		int py = findset(y);
		parents[py]=px;
	}
}
