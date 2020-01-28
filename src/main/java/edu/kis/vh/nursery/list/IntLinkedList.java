package edu.kis.vh.nursery.list;

public class IntLinkedList {

	private class Node {

		final public int value;
		public Node prev;
		public Node next;

		public Node(int i) {
			 value = i;
		}

	}


	Node last;
	int i;
	public int EMPTY_LIST = -1;

	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	public boolean isEmpty() {

		return last == null;
	}

	public boolean isFull() {

		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_LIST;
		return last.value;
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_LIST;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
