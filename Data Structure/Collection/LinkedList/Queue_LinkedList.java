public class Queue_LinkedList {
	private class Node {
		private Object data;
		private Node next;
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node front;
	private Node rear;
	
	public Queue_LinkedList() {
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty() {
		if(front==null) return true;
		else return false;
	}
	
	public void add(Object data) {
		Node newQueue = new Node(data);
		if(front==null) {
			front = newQueue;
			rear = newQueue;
		} else {
			rear.next = newQueue;
			rear = newQueue;
		}
	}
	
	public void poll() {
		Node origin = front;
		front = origin.next;
		origin=null;
		
		if(front==null) {
			rear = null;
		}
	}
	
	public Object peek() {
		return front.data;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		Node node = front;
		while(node!=null) {
			sb.append(node.data);
			if(node.next!=null) sb.append(",");
			node = node.next;
		}
		return sb.append("]").toString();
	}
	
	public static void main(String[] args) {
		Queue_LinkedList queue = new Queue_LinkedList();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.poll();
		queue.poll();
		queue.poll();
		System.out.println(queue.peek());
		queue.poll();
		System.out.println(queue.toString());
	}
}
