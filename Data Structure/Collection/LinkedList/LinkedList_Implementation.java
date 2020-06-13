public class LinkedList_Implementation {
	private static class Node {
		private Object data;
		private Node next; //다음 노드를 가르킨다.
		
		public Node(Object input) {
			this.data = input;
			this.next = null;
		}
		
		@Override
		public String toString(){
            return String.valueOf(this.data);
        }
	}
	static class LinkedList {		
		private Node head;
		private Node tail;
		private int size = 0;
		
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
		
		public int size() {
			return size;
		}
		
		public void addFirst(Object input) {
			Node newNode = new Node(input);
			newNode.next = head;
			head = newNode;
			size ++;
			if(head.next==null) tail=head;
		}
		
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
		
		public void removeFirst() {
			Node origin_head = head;
	        head = head.next;
	        origin_head = null;
	        size--;
		}
		
		public void remove(int idx) {
			if(idx==0) removeFirst();
			
			Node pre = node(idx-1);
			Node removed = pre.next;
			pre.next = pre.next.next;
			
			//만약 삭제하려는 데이터가 tail이었다면
			if(removed==tail) {
				tail = pre;
			}
			
			removed = null;
			size --;
		}
		
		public void removeLast() {
			remove(size-1);
		}
		
		public Object get(int idx) {
			return node(idx);
		}
	}
	public static void main(String[] args) {
		LinkedList linkedlist = new LinkedList();
		linkedlist.addFirst(1);
		System.out.println(linkedlist);
		
		linkedlist.add(0, 0);
		linkedlist.addLast(100);
		linkedlist.add(2, 2);
		linkedlist.addLast(200);
		System.out.println(linkedlist);
		
		linkedlist.removeFirst();
		System.out.println(linkedlist);
		
		//linkedlist.remove(3);
		//linkedlist.remove(1);
		linkedlist.removeLast();
		System.out.println(linkedlist);
		
		linkedlist.get(2);
		System.out.println(linkedlist.get(1));
	}
}
