# 유니온파인드 Disjoint-sets 상호배타집합
교집합이 없는 집합을 말한다.
1) makeSet(int x) : 자기 자신을 부모로 설정한다. 
    
       static void makeSet(int[] arr) {
	       	for (int i = 0; i < arr.length; i++) {
		     	   arr[i] = i;
		       }
	       }
2) findSet(int x) : 해당 원소가 속한 집합의 대표자를 찾는다. 즉, 자기 사진이 부모인 노드가 나올 때 까지 부모를 재귀호출한다.

	   static int findSet(int x) {
		   //자신의 부모가 자신이면 루트노드이므로, 대표자. 그러므로 자신을 리턴
		   if(parents[x]==x) return x;
		   //아니라면 계속해서 부모를 찾아나감
		   return findSet(parents[x]);
	   }
  
3) unionSet(int x, int y) : 두 개의 부모를 똑같이 만든다.

	   // union(findSet(a), findSet(b));
	   static void union(int x, int y) {
		   parents[x]=y;
	   }


🚩 Path Compression
부모를 찾아가는 과정에서 나의 조상들이 전부 나의 최고 할아버지로 변경됨

	static int findSet(int x) {
		if (parents[x] == x) return x;
		return parents[x] = findSet(parents[x]); // path-compression
	}

🚩 rank

	// union(findSet(a), findSet(b));
	static void union(int x, int y) {
		if (rank[x] > rank[y]) {
			parents[y] = x;
		} else {
			//y가 x의 조상
			parents[x] = y;
			if (rank[x] == rank[y]) {
				rank[y]++;
			}
		}
	}



# 최소신장트리(MST, Minimum Spanning Tree)
모든 정점을 연결하는 간선들의 가중치의 합이 최소가 되는 트리
* <1> 가중치를 기준으로 오름차순 정렬
* <2> 모든 간선을 돌면서
   * 1> 정점이 N개 일 때, N-1번 수행하면 MST완성 (간선의 개수가 N-1)
   * 2> 선택된 두 간선이 같은 집합이 아니라면(루트가 다르다면) union


## 크루스칼 kruskal

## Prim
### <1> 인접행렬
### <2> 인접리스트
### <3> Priority Queue

## 다익스트라

## 플로이드워샬
