package edu.kis.vh.nursery.factory;

import edu.kis.vh.nursery.DefaultCountingOutRhymer;

public class Factory2 implements RhymersFactory{
    @Override
    public DefaultCountingOutRhymer getStandardRhymer() {
        return null;
    }

    @Override
    public DefaultCountingOutRhymer getFalseRhymer() {
        return null;
    }

    @Override
    public DefaultCountingOutRhymer getFIFORhymer() {
        return null;
    }

    @Override
    public DefaultCountingOutRhymer getHanoiRhymer() {
        return null;
    }
}
