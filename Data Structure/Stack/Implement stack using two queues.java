/*
 * Implement stack using two queues
 * 큐 2개로 stack 구현하기
 */

import java.util.*;
public class MyStack {
	Queue<Object> queue;
	Queue<Object> queue2;
	
	public MyStack() {
		queue = new LinkedList<>();
		queue2 = new LinkedList<>();
	}
	
	public void push(int x) {
		queue2.add(x);
		while(!queue.isEmpty()) {
			queue2.add(queue.poll());
		}
		Queue<Object> swap = queue;
		queue = queue2;
		queue2 = swap;
	}
	
	public Object pop() {
		if(!queue.isEmpty()) {
			return queue.poll();
		}
		return null;
	}
	
	public Object peek() {
		if(!queue.isEmpty()) {
			return queue.peek();
		}
		return null;
	}
	
	public boolean empty() {
		return queue.isEmpty()&&queue.isEmpty()?true:false;
	}
	
	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.push(1);
		stack.push(2);
		System.out.println(stack.peek()); //2
		System.out.println(stack.pop()); //2
		stack.push(3);
		System.out.println(stack.pop()); //3
	}
}
