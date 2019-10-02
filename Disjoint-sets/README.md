# Disjoint-sets
1) makeSet(int x) : 자기 자신을 부모로 만든다.
2) findSet(int x) : Path Compression, 부모를 찾아가는 과정에서 나의 조상들이 전부 나의 최고 할아버지로 변경됨
3) unionSet(int x, int y) : 두 개의 부모를 똑같이 만든다.

## 최소신장트리(MST, Minimum Spanning Tree)
모든 정점을 연결하는 간선들의 가중치의 합이 최소가 되는 트리
* 1. 가중치를 기준으로 오름차순 정렬
* 2. 모든 간선을 돌면서
   * 1 정점이 N개 일 때, N-1번 수행하면 MST완성 (간선의 개수가 N-1)
   * 2 선택된 두 간선이 같은 집합이 아니라면(루트가 다르다면) union

## 크루스칼

## 
