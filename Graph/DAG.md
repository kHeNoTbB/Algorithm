# DAG(Directed Acyclic Graph, 사이클 없는 방향 그래프)
## 인접행렬을 이용한 DAG

    import java.util.Scanner;

    public class 위상정렬_강사님 {
    	public static void main(String[] args) {
	    	Scanner sc = new Scanner(System.in);
		    int M = sc.nextInt();
		    int N = sc.nextInt();
		    // 정점의 개수만큼
		    int[][] adj = new int[N][N];

		    for (int i = 0; i < M; i++) {
			    int a = sc.nextInt(); // 출발정점
			    int b = sc.nextInt(); // 도착 정점
			    adj[a][b] = 1;
	    	}
		
	    	boolean[] visited = new boolean[N];
	    	while (true) {
		    	boolean isFinish = true;
		    	// 모든 정점에 대해 검사
			    for (int i = 0; i < N; i++) {
			    	boolean isNotParent = true;
			    	for (int j = 0; j < N; j++) {
			    		if (adj[j][i] != 0) {
					    	isNotParent = false;
					    	break;
				    	}
			    	}
			    	if(isNotParent && !visited[i]) {
				    	visited[i]=true;
				    	System.out.print(i+" ");
				    	isFinish = false;
					    for(int j=0; j<N; j++) {
					    	adj[i][j]=0;
				    	}
				    }
			    }
			    //부모가 없는 녀석이 없다면 break
		    	if(isFinish) break;
	    	}
	    }
    }
