# Array, 배열

## [배열검색](https://github.com/kHeNoTbB/Algorithm/blob/master/Data%20Structure/Array%2C%20%EB%B0%B0%EC%97%B4/searchInsert.java)

* **Arrays.binarySearch(int[] arr, int target) : int** *//있으면 index*
* **searchInsert(int[] arr, int target) : int**  *//있으면 index, 없으면 target이 들어갈 index return* 



## [정렬된 배열 중복제거](https://github.com/kHeNoTbB/Algorithm/blob/master/Data%20Structure/Array%2C%20%EB%B0%B0%EC%97%B4/Array_deleteDuplication.java)

```
int len = 1;
for(int i=1; i<arr.length; i++) {
	if(arr[i]==arr[i-1]) continue;
	//else len++;
	arr[len++] =arr[i]; //중복아닌 숫자를 앞에서부터 채워넣는다.
}
```

length는 중복없는 숫자들의 개수이므로, else나 그 밑에줄이나 n-1번 도는건 똑같지만, 그 밑에줄은 결과적으로  arr[len++]에 중복없는 숫자로 채워 len의 길이만큼 중복없는 숫자들로 앞 부분이 채워지게 된다. 



## Queue 구현

배열을 이용하여 큐를 구현할 때는 '크기'가 고정되어 있고, front와 rear가 뒤로 이동한다. 처음에는 ArrayList처럼 배열연산이 있을 것이라고 생각했지만, 보통은 그냥 고정된 크기만큼 계속 front와 rear의 이동만 있는 것 같다. 따라서 front가 뒤로 가게 되면 그 공간은 더 이상 사용할 수 없어 공간이 낭비가 된다. 이러한 문제점을 해결하기 위해 이동 큐(moving queue)를 사용한다고 한다. 큐가 다 찼을 경우 앞부분에 사용할 수 있는 공간만큼 전체 데이터들을 앞쪽으로 이동시키고 rear와 front를 수정하여 남은 공간을 사용하는 방법이다. 하지만 결국은 arraylist 구현때도 느꼈듯 이러한 배열의 연산은 결코 효율적이지 않다. 그래서 원형 큐(Circular queue)를 사용하기도 한다.

