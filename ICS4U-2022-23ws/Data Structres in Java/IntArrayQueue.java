public class IntArrayQueue {
    private IntArrayStack queue;
    
    // constructor that creates a new IntArrayStack
    public IntArrayQueue(){
        queue = new IntArrayStack();
    }

    // returns true if the queue is empty, false otherwise
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    // clears the queue by creating a new IntArrayStack
    public void clear(){
        queue = new IntArrayStack();
    }

    // adds an element to the end of the queue
    // returns true if the element is successfully added
    public boolean enqueue(Integer el){
        queue.push(el);
        return true;
    }

    // removes and returns the element at the front of the queue
    public Integer dequeue(){
        return queue.pop(0);
    }

    // returns the element at the front of the queue without removing it
    public Integer peak(){
        return queue.get(0);
    }

    // returns the element at the specified index in the queue
    // throws an exception if the index is out of bounds
    public Integer get(int index){
        if (index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        else if (index > queue.search())
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        else {
            return queue.get(index);
        } 
    
    }

}
