package ua.edu.ucu.collections;

import ua.edu.ucu.collections.immutable.ImmutableArrayList;
import ua.edu.ucu.collections.immutable.ImmutableLinkedList;

public class Queue {
    private ImmutableLinkedList queue;

    public Queue(ImmutableLinkedList queue) {
        this.queue = queue;
    }

    public void enqueue(Object e)
    {
        queue = queue.addLast(e);
    }

    public Object dequeue()
    {
        Object el = queue.getFirst();
        queue = queue.removeFirst();
        return el;
    }

    public Object peek()
    {
        return queue.getFirst();
    }

    public ImmutableLinkedList getQueue() {
        return queue;
    }

}
