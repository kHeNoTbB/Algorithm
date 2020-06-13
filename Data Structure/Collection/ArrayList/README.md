# ArrayList

 📌 [전체코드](https://github.com/kHeNoTbB/Algorithm/blob/master/Data%20Structure/Collection/ArrayList/ArrayList_Implementation.java)

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



#### 데이터 출력

```
@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	sb.append("ArrayList = [");
	for(int i=0; i<size; i++) {
		sb.append(elementData[i]);
		if(i<size-1) sb.append(",");
	}
	return sb.append("]").toString();
}
```



------

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

```
public boolean add(int idx, Object element) {
	if(elementData.length==size) expandArray();
	for(int i=size-1; i>=idx; i--) {
		elementData[i+1] = elementData[i]; 
	}
	elementData[idx] = element;
	size++;
	return true;
}

```

중간에 데이터를 추가하려면, 추가하려는 공간 이후의 데이터들은 한칸씩 자리를 뒤로 이동해줘야 한다. 여기서 중요한 것은, 뒤로 이동하려는 데이터는 무조건 뒤에서부터 이동해야 한다. 만약 앞에 있는 데이터부터 순차적으로 이동하면, 앞의 데이터들만 아마 값이 복사가 될 것이다. 이 얘기가 와닿지 않으면 다음 코드를 실행해보자.

```
public boolean add(int idx, Object element) {
	if(elementData.length==size) expandArray();
	for(int i=idx; i<size; i++) {
		elementData[i+1] = elementData[i]; 
	}
	elementData[idx] = element;
	size++;
	return true;
}

public static void main(String[] args) {
		ArrayList arrayList = new ArrayList();
		arrayList.addLast(10);
		arrayList.addLast(20);
		arrayList.addLast(30);
		arrayList.addLast(40);
		arrayList.addLast(10);
		arrayList.addLast(20);
		arrayList.addLast(30);
		arrayList.addLast(40);
		arrayList.addLast(10);
		arrayList.addLast(20);
		arrayList.add(2, 2000);
		System.out.println(arrayList.toString());
}
```

원래는 위 코드를 실행하면 `ArrayList = [10,20,2000,30,40,10,20,30,40,10,20]` 를 기대할 것이다. 하지만 실행해보면 기대와 다르게 `ArrayList = [10,20,2000,30,30,30,30,30,30,30,30]` 가 실행됨을 알 수 있다. 첫번째 데이터부터 이동하므로, 이동하면서 뒤 데이터가 모두 첫번째 데이터 값으로 복사되기 때문이다.





##### (3) 첫번째에 데이터 추가

```
public boolean addFirst(Object element) {
	return add(0, element);
}
```



-----

#### 데이터의 삭제

```
public Object remove(int idx) {
	Object removed = elementData[idx];			
	for(int i=idx+1; i<=size-1; i++) {
		elementData[i-1] = elementData[i];
	}
	elementData[size--] = null;
	return removed;
}

public Object removeFirst() {
	return remove(0);
}
		
public Object removeLast() {
	return remove(size-1);
}
```

삭제할 idx 이후의 데이터를 한칸 씩 땡기면 된다. 이 때는 앞에서부터 끌어오면 된다. 삭제 후에는, 가장 마지막 공간을 null로 바꿔줘야 함을 잊지 말아야 한다.



-----

### 데이터의 검색

```
public Object get(int idx) {
	return elementData[idx];
}
```

ArrayList의 자료 검색은, 배열을 활용하였으므로 index로 바로 접근하기 때문에 매우 간단하다. 위의 삽입/삭제와 다르게 한번에 찾으므로 굉장히 빠른 속도를 자랑한다고 볼 수 있다.



----

## ArrayList의 복잡도

### 검색 O(1)



### 삽입/삭제 O(N)
