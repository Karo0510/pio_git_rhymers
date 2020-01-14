package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    IntArrayStack list = new IntArrayStack();

    public DefaultCountingOutRhymer(IntArrayStack list) {
        this.list = list;
    }

    public DefaultCountingOutRhymer() {
    }

    public void countIn(int in) {
        list.countIn(in);
    }

    public boolean callCheck() {
        return list.callCheck();
    }

    public boolean isFull() {
        return list.isFull();
    }

    public int peekaboo() {
        return list.peekaboo();
    }

    public int countOut() {
        return list.countOut();
    }

    public int getTotal() {
        return list.getTotal();
    }

    public int setTotal(int total) {
        return list.setTotal(total);
    }
}
