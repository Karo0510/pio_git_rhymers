package edu.kis.vh.nursery;


import edu.kis.vh.nursery.ListIntegers.IntArrayStack;

public class DefaultCountingOutRhymer {

    IntArrayStack arr = new IntArrayStack();

    public DefaultCountingOutRhymer() {
        this.arr = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(IntArrayStack arr) {
        this.arr = arr;
    }

    public int peekaboo() {
        return arr.top();
    }

    public void countIn(int in) {
        arr.push(in);
    }

    public boolean callCheck() {
        return arr.isEmpty();
    }

    public boolean isFull() {
        return arr.isFull();
    }

    public int countOut() {
        return arr.pop();
    }

    public int getTotal() {
        return arr.getTotal();
    }
}
