package edu.kis.vh.nursery.ListIntegers;

import edu.kis.vh.nursery.ListInterface;

public class IntLinkedList implements ListInterface {

	private class Node {

		final private int value;
		private Node prev;
		private Node next;

		public Node(int i) {
			 value = i;
		}

	}


	Node last;
	int i;
	public int EMPTY_LIST = 0;

	@Override
	public void push(int i) {
		if (last == null)
			last = new Node(i);
		else {
			last.next = new Node(i);
			last.next.prev = last;
			last = last.next;
		}
	}

	@Override
	public boolean isEmpty() {

		return last == null;
	}

	@Override
	public boolean isFull() {

		return false;
	}

	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_LIST;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_LIST;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
