package ua.edu.ucu.collections.immutable;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class ImmutableArrayListTest {
    private ImmutableList list1;
    private ImmutableList list2 = new ImmutableArrayList();

    @Before
    public void before() {
        list1 = new ImmutableArrayList(new Object[] {3, 8, 2, 4, 4, 6, 1}); // dwseafrgfthyhjgfdnhhnnggfgdgffgfgfggffgfggfgffgfgfg
        list2 = new ImmutableArrayList();
    }
    @Test
    public void testAddOne() {
        ImmutableList newList1 = list1.add(1);
        Object[] expList1 = {3, 8, 2, 4, 4, 6, 1, 1};
        assertArrayEquals(expList1, newList1.toArray());
        ImmutableList newList2 = list1.add(3, 1);
        Object[] expList2 = {3, 8, 2, 1, 4, 4, 6, 1};
        assertArrayEquals(expList2, newList2.toArray());
    }

    @Test
    public void testAddAll() {
        ImmutableList newList1 = list1.addAll(new Object[] {4, 5, 6});
        Object[] expList1 = {3, 8, 2, 4, 4, 6, 1, 4, 5, 6};
        assertArrayEquals(expList1, newList1.toArray());
        ImmutableList newList2 = list1.addAll(5, new Object[] {4, 5, 6});
        Object[] expList2 = {3, 8, 2, 4, 4, 4, 5, 6, 6, 1};
        assertArrayEquals(expList2, newList2.toArray());
    }

    @Test
    public void testGet() {
        Object value = list1.get(3);
        Object expValue = 4;
        assertEquals(expValue, value);
    }

    @Test
    public void testRemove() {
        ImmutableList newList = list1.remove(1);
        Object[] expList = {3, 2, 4, 4, 6, 1};
        assertArrayEquals(expList, newList.toArray());
    }

    @Test
    public void testSet() {
        ImmutableList newList = list1.set(6, 9);
        Object[] expList = {3, 8, 2, 4, 4, 6, 9};
        assertArrayEquals(expList, newList.toArray());
    }

    @Test
    public void testIndexOf() {
        int index = list1.indexOf(8);
        int expIndx = 1;
        assertEquals(expIndx, index);
    }

    @Test
    public void testSize() {
        int size = list1.size();
        int expSize = 7;
        assertEquals(expSize, size);
    }

    @Test
    public void testisEmpty() {
        boolean isList1 = false;
        boolean isList2 = true;
        assertEquals(isList1, list1.isEmpty());
        assertEquals(isList2, list2.isEmpty());
    }

    @Test
    public void testClear() {
        boolean empty = true;
        ImmutableList newList1 = list1.clear();
        assertEquals(empty, newList1.isEmpty());
    }

    @Test
    public void testToString() {
        String expList1 = "[3, 8, 2, 4, 4, 6, 1]";
        String strList1 = list1.toString();
        assertEquals(expList1, strList1);
    }
}
