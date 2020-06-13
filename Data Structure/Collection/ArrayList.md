# ArrayList

* 연속적으로 데이터를 묶어 저장한다.
* 인덱스로 무작위 접근이 가능하다.
* 기본 저장 용량을 가지고 있으며, 이후 데이터 크기에 따라 용량이 자동적으로 늘어난다.



## ArrayList 구현

#### 기본구조

```
private static final int INIT_SIZE = 10;
static class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[INIT_SIZE];
		
	public boolean addLast(Object element) {
		elementData[size++] = element;
		return true;
}
```

size와 제네릭으로 배열 하나를 정의한 ArrayList를 생성했다. ArrayList는 기본 저장 용량을 갖고 있다.



#### 자동 배열 크기증가

```
private void expandArray() {
	Object[] newArray = new Object[size*2];
	for(int i=0; i<elementData.length; i++) {
		newArray[i] = elementData[i];
	}
	elementData = newArray;
}
```

배열 크기는 사용자가 늘리지 않으므로 private method로 생성한다. 보통 add 연산 시 사용되는 것으로, 새로 더 큰 array를 만든 후에 기존의 array에 있던 원소들을 복사한다.



#### 데이터의 추가

##### (1) 가장 마지막에 데이터 추가하기

```
public boolean addLast(Object element) {
	if(elementData.length==size) expandArray();
	elementData[size++] = element;
	return true;
}
```

요소값을 현재 size에 추가하고 size를 들리는 모습이다. 만약 공간이 없다면 자동적으로 배열의 사이즈를 늘려줘야 한다.



##### (2) 중간에 데이터 추가하기





## ArrayList의 복잡도

### 검색 O(1)



### 삽입/삭제 O(N)
