package ar.fiuba.tdd.template;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;




public class MainTests {

    @Test
    public void dummy() {
        assertEquals(0, 0);
    }


    @Test public void testEmptyQueue() {
        Queue<Integer> testQueue = new Queue<Integer>();
        assertTrue(testQueue.isEmpty());
    }

    @Test
    public void testZeroSizeQueue() {
        Queue<Integer> testQueue = new Queue<Integer>();
        assertEquals(testQueue.size(),0);
    }

    @Test
    public void testAddItemsToQueue() {
        Queue<Integer> testQueue = new Queue<Integer>();
        assertEquals(testQueue.size(),0);
        testQueue.add(5);
        assertEquals(testQueue.size(),1);
        testQueue.add(8);
        testQueue.add(10);
        assertEquals(testQueue.size(),3);
    }

    @Test
    public void testGetTopItemFromQueue() {
        Queue<Integer> testQueue = new Queue<Integer>();
        testQueue.add(45);
        assertEquals(testQueue.top(),(Integer)45);
        testQueue.add(95);
        testQueue.add(123);
        assertEquals(testQueue.top(),(Integer)45);
    }

    @Test
    public void testRemoveItemsFromQueue() {
        Queue<Integer> testQueue = new Queue<Integer>();
        testQueue.add(45);
        assertEquals(testQueue.size(),1);
        testQueue.remove();
        assertEquals(testQueue.size(),0);
        assertTrue(testQueue.isEmpty());
        testQueue.add(45);
        testQueue.add(85);
        testQueue.remove();
        assertEquals(testQueue.top(),(Integer) 85);
    }

    @Test
    public void testRemovingItemsChangesQueueSize() {
        Queue<Integer> testQueue = new Queue<Integer>();
        testQueue.add(45);
        assertEquals(testQueue.size(),1);
        testQueue.add(78);
        assertEquals(testQueue.size(),2);
        testQueue.remove();
        assertEquals(testQueue.size(),1);
    }

    @Test (expected = AssertionError.class)
    public void testEmptyQueueTopThrowsException() {
        Queue<Integer> testQueue = new Queue<Integer>();
        testQueue.top();
    }

    @Test (expected = AssertionError.class)
    public void testEmptyQueueRemoveThrowsException() {
        Queue<Integer> testQueue = new Queue<Integer>();
        testQueue.remove();
    }
}
