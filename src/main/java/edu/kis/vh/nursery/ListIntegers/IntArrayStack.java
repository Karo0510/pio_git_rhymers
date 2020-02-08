package edu.kis.vh.nursery.ListIntegers;

import edu.kis.vh.nursery.ListInterface;

public class IntArrayStack implements ListInterface {

    public int MAX_AMOUNT_OF_ELEMENTS = 12;
    final public int[] numbers = new int[MAX_AMOUNT_OF_ELEMENTS];

    private static int EMPTY_STACK_INDEX = -1;

    private int total = EMPTY_STACK_INDEX;


    @Override
    public void push(int in) {
        if (!isFull())
            numbers[++total] = in;
    }


    @Override
    public boolean isEmpty() {
        return total == EMPTY_STACK_INDEX;
    }


    public boolean isFull() {
        return total == MAX_AMOUNT_OF_ELEMENTS - 1;
    }


    @Override
    public int top() {
        if (isEmpty())
            return LIST_IS_EMPTY;
        return numbers[total];
    }


    @Override
    public int pop() {
        if (isEmpty())
            return LIST_IS_EMPTY;
        return numbers[total--];
    }


    public int getTotal() {
        return total;
    }

}
