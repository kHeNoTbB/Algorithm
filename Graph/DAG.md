# DAG(Directed Acyclic Graph, 사이클 없는 방향 그래프)
## 개념
* 정점의 개수와 간선정보가 주어진다.
* 간선(연결)정보를 통해 인접행렬/인접리스트를 그릴 수 있다.
* 그려진 인접행렬/인접리스트를 통해, 부모가 없는 정점을 방문한다.
* 방문한 정점으로부터 연결된 모든 경로를 삭제한다.
* 모든 정점을 방문했다면, 종료한다.

## 인접행렬을 이용한 DAG
### 전체코드

    import java.util.Scanner;

    public class Solution {
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

## 인접리스트 이용한 DAG

    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    import java.util.Queue;
    import java.util.Scanner;

    /*
    testcase
    8 7
    0 2
    0 1
    2 5
    1 4
    5 4
    3 4
    3 6
    1 3
    */

    public class Solution {
	    public static void main(String[] args) {
		    //인접 리스트로 입력받아 보기
		    Scanner sc = new Scanner(System.in);
		    int N = sc.nextInt();
		    int M = sc.nextInt();
		
		    int[] parentNum = new int[N];
		
		    //N개의 가변길이 배열이 필요함
		    List<Integer>[] adj = new ArrayList[N];
		    for(int i=0; i<N; i++) {
		    	    adj[i] = new ArrayList<>();
		    }
		    for(int i=0; i<M; i++) {
			    int a = sc.nextInt();
			    int b = sc.nextInt();
			    adj[a].add(b);
			    parentNum[b]++;
		    }
		    Queue<Integer> queue=  new LinkedList<>();
		    //부모카운트가 0인 친구를 방문하기 위해 큐에 삽입
		    for(int i=0; i<N; i++) {
			    if(parentNum[i]==0) queue.add(i);
		    }
		
		    while(!queue.isEmpty()) {
			    //큐에서 꺼내서 방문
			    int n = queue.poll();
			    System.out.println(n);
			
			    //방문한 노드에서 연결되는 친구들의 부모카운트를 1씩 감소시키고, 그 값이 0이되면 큐에 삽입함
			    for(int i=0; i<adj[n].size(); i++) {
				    if(--parentNum[adj[n].get(i)]==0)
					    queue.add(adj[n].get(i));
			    }
		    }
		
	    }
    }

## problems
### [SWEA 1267 작업순서](https://swexpertacademy.com/main/code/problem/problemDetail.do)
### [백준 2252 줄세우기](https://www.acmicpc.net/problem/2252)
### [백준 1516 게임개발](https://www.acmicpc.net/problem/1516)
