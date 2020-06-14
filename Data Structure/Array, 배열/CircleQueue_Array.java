/*
 * poll : front 이동
 * add : rear 이동
 * isFull : (rear + 1) % maxSize == front
 */

public class CircleQueue_Array {
	private int rear = 0;
	private int front = 0;
	private int maxsize = 0;
	private Object[] circular_Queue;
	
	public CircleQueue_Array(int maxsize) {
		this.maxsize = maxsize;
		circular_Queue = new Object[this.maxsize];
	}
	
	public boolean isEmpty() {
		if(front==rear) return true;
		else return false;
	}
	
	public boolean isFull() {
		if((rear+1)%maxsize==front) return true;
		else return false;
	}
	
	public void add(Object data) {
		if(!isFull()) {
			rear = (rear+1)%maxsize;
			circular_Queue[rear] = data;
		}
	}
	
	public Object poll() {
		if(!isEmpty()) {
			front = (front+1)%maxsize;
			return circular_Queue[front];
		}
		return null;
	}
}
