public class IntArrayStack {
    private int top;
    private Integer[] stack;

    // constructor that creates a new Integer array with size 0 and sets top to -1
    public IntArrayStack() {
        stack = new Integer[0];
        top = -1;
    }

    // pushes an element to the top of the stack
    // resizes the stack if necessary
    // returns the stack array
    public Integer[] push(Integer data) {
        if (stack.length - top < 2) {
            Integer[] temp = new Integer[stack.length + 1];
            for (int i = 0; i < stack.length; i++) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        stack[++top] = data;
        return stack;
    }

    // pops the element at the top of the stack
    // returns the element or null if the stack is empty
    public Integer pop() {
        if (top < 0)
            return null;
        else {
            int remove = stack[top];
            Integer[] temp = new Integer[stack.length - 1];
            for (int i = 0, k = 0; i < stack.length; i++) {
                if (stack[i] != remove) {
                    temp[k] = stack[i];
                    k++;
                }
            }
            top--;
            stack = temp;
            return remove;
        }
    }

    // pops the element at the specified index
    // returns the element or null if the stack is empty
    public Integer pop(int index) {
        if (top < 0)
            return null;
        else {
            int remove = stack[index];
            Integer[] temp = new Integer[stack.length - 1];
            for (int i = 0, k = 0; i < stack.length; i++) {
                if (stack[i] != remove) {
                    temp[k] = stack[i];
                    k++;
                }
            }
            top--;
            stack = temp;
            return remove;
        }
    }

    // returns the element at the top of the stack without removing it
    // returns null if the stack is empty
    public Integer peek() {
        if (top < 0)
            return null;
        else
            return stack[top];
    }

    // returns the index of the top of the stack
    public Integer search() {
        return top;
    }

    // returns true if the stack is empty, false otherwise
    public boolean isEmpty() {
        return (top == -1);
    }

    // returns the element at the specified index in the stack
    // throws an exception if the index is out of bounds
    public Integer get(int index) {
        if (index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        else if (stack.length==0)
            throw new IllegalStateException("Stack is Empty.");
        else if (index > stack.length-1)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        else {
            return stack[index];
        }
    }


    public String toString() {
        String result = "{";
        for (int i = 0; i <= top; i++) {
            result += stack[i] + ", ";
        }
        if (!isEmpty()) {
            result = result.substring(0, result.length() - 2);
        }
        result += "}";
        return result;
    }

}