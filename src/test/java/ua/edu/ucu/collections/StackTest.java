package ua.edu.ucu.collections;

import org.junit.Before;
import org.junit.Test;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;

    @Before
    public void before() {
        ImmutableLinkedList list1 = new ImmutableLinkedList(new Object[] {3, 8, 2, 4, 4, 6, 1});
        this.stack = new Stack(list1);
    }

    @Test
    public void testPush() {
        Object[] newStack = {9, 3, 8, 2, 4, 4, 6, 1};
        stack.push(9);
        assertArrayEquals(newStack, stack.getStack().toArray());
    }

    @Test
    public void testPop() {
        Object[] newStack = {8, 2, 4, 4, 6, 1};
        stack.pop();
        assertArrayEquals(newStack, stack.getStack().toArray());
    }

    @Test
    public void testPeek() {
        Object el = stack.peek();
        Object exp = 3;
        assertEquals(exp, el);
    }
}
