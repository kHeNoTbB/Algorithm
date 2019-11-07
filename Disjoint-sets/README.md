# ✔️ 유니온파인드 Disjoint-sets 상호배타집합
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
  
  🚩 Path Compression
  부모를 찾아가는 과정에서 나의 조상들이 전부 나의 최고 할아버지로 변경됨

	static int findSet(int x) {
		if (parents[x] == x) return x;
		return parents[x] = findSet(parents[x]); // path-compression
	}
  
3) unionSet(int x, int y) : 두 개의 부모를 똑같이 만든다.

	   // union(findSet(a), findSet(b));
	   static void union(int x, int y) {
		   parents[x]=y;
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
