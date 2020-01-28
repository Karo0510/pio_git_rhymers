package edu.kis.vh.nursery;


import edu.kis.vh.nursery.ListIntegers.IntArrayStack;
import edu.kis.vh.nursery.ListIntegers.IntLinkedList;

public class DefaultCountingOutRhymer {

    private ListInterface list;

    public DefaultCountingOutRhymer() {
        this.list = new IntArrayStack();
    }

    public DefaultCountingOutRhymer(ListInterface list) {
        this.list = list;
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }


    public int peekaboo() {
        return list.top();
    }

    public void countIn(int in) {
        list.push(in);
    }

    public boolean callCheck() {
        return list.isEmpty();
    }

    public boolean isFull() {
        return list.isFull();
    }

    public int countOut() {
        return list.pop();
    }

    public int getTotal() {
        return ((IntArrayStack)list).getTotal();
    }
}
