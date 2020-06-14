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
