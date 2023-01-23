public class IntLLQueue {
    private IntLinkedList queue;

    // constructor that creates a new empty linked list
    public IntLLQueue() {
        queue = new IntLinkedList();
    }

    // returns true if the queue is empty, false otherwise
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    // clears the queue
    public void clear() {
        queue = new IntLinkedList();
    }

    // adds an element to the end of the queue
    // returns true if the element is successfully added
    public boolean enqueue(Integer el) {
        return queue.add(el);
    }

    // removes and returns the element at the front of the queue
    public Integer dequeue() {
        return queue.removeFront();
    }

    // returns the element at the front of the queue without removing it
    public Integer peak() {
        return queue.get(0);
    }

    // returns the element at the specified index in the queue
    // throws an exception if the index is out of bounds or the queue is empty
    public Integer get(int index) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        if (queue.isEmpty())
            throw new IllegalStateException("Queue is empty.");
        else if (index > queue.size()-1)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        else {
            return queue.get(index);
        }
    }
    
}