package D4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 창용마을무리의개수 {
	static int[] parents;
	static int ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine().trim());
		
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer nm = new StringTokenizer(br.readLine(), " ");
			int N = Integer.parseInt(nm.nextToken());
			int M = Integer.parseInt(nm.nextToken());

			
			ans=N;
			parents = new int[N+1];
			for (int i = 0; i < parents.length; i++) {
				makeSet(i);
			}
			for(int i=0; i<M; i++) {
				StringTokenizer xy = new StringTokenizer(br.readLine(), " ");
				union(Integer.parseInt(xy.nextToken()), Integer.parseInt(xy.nextToken()));

			}
			System.out.println("#"+tc+" "+ans);
		}
		
	}
	
	//현재 부모배열을 출력하는 함수..
	static void printSet() {		
		for(int i = 0; i < parents.length; i++)
            System.out.print(findSet(i) + " ");
        System.out.println();
	}
	
	static void makeSet(int x) {
		 parents[x] = x;
	}
	static int findSet(int x) {
        if( parents[x] == x )
            return x;
        parents[x] = findSet(parents[x]);
        return findSet(parents[x]);
    }
	static void union(int x, int y) {
		int px = findSet(x);
        int py = findSet(y);
        if(px!=py) {
        	ans--;
        	parents[py] = px;
        }
        
	}
}

