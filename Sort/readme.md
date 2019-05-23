### Sorting algorithm, 정렬

#### Bubble sort 버블 정렬
데이터 집합을 순회하면서 집합 내의 이웃 요소들끼리의 교환을 통해 정렬을 수행한다.

교환하기 전에 먼저 왼쪽부터 둘 사이를 비교하여 이웃끼리 올바른 순서로 위치해 있는지를 확인한다. 오름차순으로 정렬하려 한다면, 왼쪽에 있는 요소가 오른쪽에 있는 요소보다 작아야 한다. 
![3](https://user-images.githubusercontent.com/30182987/58224876-6665ff80-7d5a-11e9-9e23-a9657b598b18.png)

그렇게 차례대로 비교하다보면, 제일 큰 수가 가장 오른쪽에 위치하게 된다.

![3](https://user-images.githubusercontent.com/30182987/58224882-6a921d00-7d5a-11e9-8c25-c44742fb7440.png)

이런 순서대로 정렬한다면, 정렬의 속도는 어떨까?
i=1일때, j가 n-1번이고

i=2일때, j가 n-2번이므로,

버블정렬의 비교횟수 = (n-1)+(n-2)+(n-3)+...+3+2+1 = n(n-1)/2

    void BubbleSort(int DataSet[], int Length) {
	int i = 0, j = 0, tmp = 0;

	for (i = 0; i < Length - 1; i++) {
		for (j = 0; j < Length - (i + 1); j++) {
			if (DataSet[j] > DataSet[j + 1]) {
				tmp = DataSet[j + 1];
				DataSet[j + 1] = DataSet[j];
				DataSet[j] = tmp;
		  	}
	  	 }
       }
    }
