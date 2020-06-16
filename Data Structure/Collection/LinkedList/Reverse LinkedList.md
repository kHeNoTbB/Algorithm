# Reverse LinkedList

```
public Node reverseList(Node head) {
	Node child = null;
	Node parent = null;

	while (head != null) {
		parent = new Node(head.data);
		parent.next = child;
		child = parent;
		head = head.next;
	}
	return parent;
}
```

우선 head를 parent에 복사하고, child를 가르키게 한다. 그 다음 방금 바꾼 노드를 child로 변경한다. 즉, parent는 swap을 위한 node이고 child를 통해 서로를 가르키게 한다.

