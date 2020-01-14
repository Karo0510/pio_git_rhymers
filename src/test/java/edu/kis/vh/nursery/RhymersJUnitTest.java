package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class RhymersJUnitTest {

    @Test
    public void testCountIn() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCallCheck() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        Assert.assertTrue(rhymer.callCheck());

        rhymer.countIn(888);

        Assert.assertFalse(rhymer.callCheck());
    }

    @Test
    public void testIsFull() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int STACK_CAPACITY = 12;

        for (int i = 0; i < STACK_CAPACITY; i++) {
            Assert.assertFalse(rhymer.isFull());
            rhymer.countIn(888);
        }

        Assert.assertTrue(rhymer.isFull());
    }

    @Test
    public void testPeekaboo() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.peekaboo());

        for (int i = 0; i<10; i++)
            rhymer.countIn(i);

        int testValue = 9;

        Assert.assertEquals(testValue, rhymer.peekaboo());
    }

    @Test
    public void testCountOut() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();
        final int EMPTY_STACK_VALUE = -1;

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());

        int testValue = 4;
        rhymer.countIn(testValue);

        Assert.assertEquals(testValue, rhymer.countOut());

        Assert.assertEquals(EMPTY_STACK_VALUE, rhymer.countOut());
    }

    //----------Testy dla FIFORhymers
    @Test
    public void testCountOutFIFO() {
        FIFORhymer rhymer = new FIFORhymer();

        int [] ans = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = 0; i < 10; i++)
            rhymer.countIn(i);

        for (int i = 0; i<10; i++)
            Assert.assertEquals(rhymer.countOut(), ans[i]);

    }

    //-------------Testy dla HanoiRhymers

    @Test
    public void testCountInHanoi()
    {
        HanoiRhymer rhymer = new HanoiRhymer();

        int[] numbers = {5, 8, 1, 0, 3, 10, 12, 6, 7};

        for (int i = 0; i<numbers.length; i++)
            rhymer.countIn(numbers[i]);

        int[] ans = {0, 1, 5};

        Assert.assertEquals(rhymer.total, ans.length - 1);

        for (int i = 0; i<ans.length; i++)
            Assert.assertEquals(rhymer.countOut(), ans[i]);

    }

}
