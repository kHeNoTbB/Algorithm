# 우선순위 큐
## 내림차순 정렬하기
### (1) Comparator.reverseOrder() 사용하기
``PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());``

### (2) 정식으로 compare override
    PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2 - o1;
        }
    });
