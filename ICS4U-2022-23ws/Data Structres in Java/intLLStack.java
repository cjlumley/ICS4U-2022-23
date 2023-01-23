public class intLLStack {
    private IntNode head;
    private int top = -1;

    // adds an element to the top of the stack
    // returns true if the element is successfully added
    public boolean push(Integer el) {
        head = new IntNode(el, head);
        top++;
        return true;
    }

    // removes and returns the element at the top of the stack
    public Integer pop() {
        if (head == null) {
            return null;
        } else {
            Integer temp = head.getData();
            head = head.getLink();
            top--;
            return temp;
        }
    }

    // returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return head == null;
    }

    // returns the element at the top of the stack without removing it
    public Integer peek() {
        if (head == null) {
            return null;
        } else {
            return head.getData();
        }
    }

    // returns the current size of the stack
    public Integer search() {
        if (isEmpty()) {
            return -1;
        } else {
            return top;
        }
    }

    // returns the element at the specified index in the stack
    // throws an exception if the index is out of bounds or the stack is empty
    public Integer get(int index) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        if (head == null)
            throw new IllegalStateException("List is empty.");
        else if (index > top)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        else {
            IntNode curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getLink();
            }
            return curr.getData();
        }
    }

    // returns a string representation of the stack
    public String toString() {
        String result = "{";
        IntNode curr = head;

        while (curr != null) {
            result += curr.getData() + ", ";
            curr = curr.getLink();
        }

        if (!isEmpty()) {
            result = result.substring(0, result.length() - 2);
        }
        result += "}";

        return result;
    }
}