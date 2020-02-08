package edu.kis.vh.nursery;

public interface ListInterface {

    public static final int LIST_IS_EMPTY = 0;

    void push(int i);

    boolean isEmpty();

    boolean isFull();

    int top();

    int pop();
}
