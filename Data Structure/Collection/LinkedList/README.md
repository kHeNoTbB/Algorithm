# LinkedList

* 무한개의 자료 삽입 가능함

* 데이터에 순차접근함

  

## LinkedList의 구현

#### 기본구조

```
private static class Node {
	private Object data;
	private Node next; //다음 노드를 가르킨다.
		
	public Node(Object input) {
		this.data = input;
		this.next = null;
	}
		
	@Override
	public String toString() {
        return String.valueOf(this.data);
    }
    
}

static class LinkedList {		
	private Node head;
	private Node tail;
	private int size = 0;
}
```



#### 데이터 출력

```
@Override
public String toString() {
	if(head == null) return "[]";
	StringBuilder sb = new StringBuilder();
	sb.append("[");
	Node tmp = head;
	while(tmp.next!=null) {
		sb.append(tmp.data).append(",");
		tmp = tmp.next;
	}
	sb.append(tmp.data).append("]");
	return sb.toString();
}
```

head부터 head의 data를 출력하고, next link를 통해서 다음 노드로 이동하면서 순차적으로 접근한다. 즉 ArrayList와 달리, LinkedList는 순차적으로 데이터에 접근함을 알 수 있다.



-----

#### 데이터 추가

##### (1) 첫번째에 데이터 추가

```
public void addFirst(Object input) {
	Node newNode = new Node(input);
	newNode.next = head;
	head = newNode;
	size ++;
	if(head.next==null) tail=head;
}
```

넣을 데이터를 newNode로 생성 후에, 첫번째에 있던 newNode의 next를 현재 head로 변환하고, head를 넣을 데이터로 바꾸면 된다. 주의할 점은, 만약 head.next 즉, 그 다음 데이터가 없다면, 방금 추가한 데이터가 유일하므로 haed이자 tail이 된다.



##### (2) 마지막에 데이터 추가

```
public void addLast(Object input) {
	Node newNode = new Node(input);
	if(size==0) {
		addFirst(input);
	} else {
		tail.next = newNode;
		tail = newNode;
		size++;
	}
}
```

마지막에 넣는 경우도 마찬가지다. size가 0이면 결국 first이고, 그것이 아니라면 tail의 next를 넣을 데이터로 정의하고, tail을 집어넣을 input data로 변경하면 된다.



##### (3) 중간에 데이터 추가

```
private Node node(int idx) {
	Node x = head;
	for(int i=0; i<idx; i++) {
		x = x.next;
	}
	return x;
}

public void add(int idx, Object input) {
	Node newNode = new Node(input);
			
	if(size==0 || idx==0) {
		addFirst(input);
	} else {
		Node pre = node(idx-1);
		Node next = node(idx);
		pre.next = newNode;
		newNode.next = next;				
		size++;
				
		if(newNode.next==null) {
			tail = newNode;
		}
	}
}
```

따지고보면 가장 복잡한 로직이다. 원래 넣을 데이터의 idx에 있던 data의 next를 지금 집어넣을 데이터로 변경하고, 넣을 데이터의 next를 원래 그 자리에 있었던 dat를 가르키게 바꾸면 된다.  여기서 데이터를 idx로 찾기 위해서 함수가 필요하다. 이 때는 idx로 순차적으로 데이터를 찾게 된다. 순차적으로 데이터를 찾긴 하지만, 결론적으로 배열 연산(데이터 복사 붙여넣기, 배열의 이동 등) 없이, 링크의 이동만 있기 때문에 검색연산 외로 ArrayList보다 빠르다고 볼 수 있다.





----

## 복잡도

#### 검색 O(N)

### 삽입/삭제 O(1)

