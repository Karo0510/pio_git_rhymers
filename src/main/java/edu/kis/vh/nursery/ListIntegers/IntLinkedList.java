package edu.kis.vh.nursery.ListIntegers;

import edu.kis.vh.nursery.ListInterface;

public class IntLinkedList implements ListInterface {

	private class Node {

		final int value;
		Node prev;
		Node next;

		Node(int i) {
			 value = i;
		}

		public int getValue() {
			return value;
		}
	}


	Node last;
	int i;

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
			return LIST_IS_EMPTY;
		return last.value;
	}

	@Override
	public int pop() {
		if (isEmpty())
			return LIST_IS_EMPTY;
		int ret = last.value;
		last = last.prev;
		return ret;
	}

}
