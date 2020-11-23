package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableArrayList;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;
import ua.edu.ucu.collections.immutable.ImmutableList;

import static org.junit.Assert.*;

public class QueueTest {
    private Queue queue;

    @Before
    public void before() {
        ImmutableLinkedList list1 = new ImmutableLinkedList(new Object[] {3, 8, 2, 4, 4, 6, 1});
        this.queue = new Queue(list1);
    }

    @Test
    public void testEnqueue() {
        Object[] newQueue = {3, 8, 2, 4, 4, 6, 1, 3};
        queue.enqueue(3);
        assertArrayEquals(newQueue, queue.getQueue().toArray());
    }

    @Test
    public void testDequeue() {
        Object[] newQueue = {8, 2, 4, 4, 6, 1};
        Object el = queue.dequeue();
        Object exp = 3;
        assertArrayEquals(newQueue, queue.getQueue().toArray());
        assertEquals(exp, el);
    }

    @Test
    public void testPeek() {
        Object el = queue.peek();
        Object exp = 3;
        assertEquals(exp, el);
    }
}
