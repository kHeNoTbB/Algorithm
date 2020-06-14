public class Stack_LinkedList {
	private class Node {
		private Object data;
		private Node next;
		public Node(Object data) {
			this.data = data;
			this.next = null;
		}
	}
	
	private Node top;
	public Stack_LinkedList() {
		this.top = null;
	}
	
	public boolean isEmpty() {
		if(top==null) return true;
		return false;
	}
	
	public void push(Object data) {
		Node newNode = new Node(data);
		newNode.next = top;
		top = newNode;
	}
	
	public void pop() {
		top = top.next;
	}
	
	public Object peek() {
		if(!isEmpty()) {
			return top.data;
		}
		return null;
	}
	
	public static void main(String[] args) {
		Stack_LinkedList stack = new Stack_LinkedList();
		stack.push(1);
		stack.push(2);
	}
}
