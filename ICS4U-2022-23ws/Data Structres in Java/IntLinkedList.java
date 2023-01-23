public class IntLinkedList {
    private IntNode head;
    private int manyItems;

    // constructor that creates an empty linked list
    public IntLinkedList() {
        this.head = null;
    }

    // adds an element to the end of the linked list
    // returns true if the element is successfully added
    public boolean add(Integer data) {
        IntNode temp = new IntNode(data);

        if (head == null){
            head = temp;
            manyItems++;
    }
        else {
            IntNode curr = head;
            while (curr.getLink() != null)
                curr = curr.getLink();
            curr.setLink(temp);
            manyItems++;
        }
        return true;
    }

    // adds an element to the front of the linked list
    // returns true if the element is successfully added
    public boolean addFront(Integer data) {
        head = new IntNode(data, head);
        manyItems++;
        return true;
    }

    // adds an element at the specified index in the linked list
    // throws
    public boolean add(int index, Integer data) {
        if (index > manyItems)
            throw new IndexOutOfBoundsException("Index " + index + " is not allowed max index is " + manyItems);
        if (index == 0) {
            addFront(data);
        } else {
            IntNode curr = head;
            for (int i = 0; i < index - 1; i++) {
                curr = curr.getLink();
            }
            curr.setLink(new IntNode(data, curr.getLink()));
            manyItems++;
        }
        return true;
    }

    public boolean isEmpty(){
        return(head == null);
    }

    public Integer remove(Integer data){
        if(head==null){
            return null;
        }
        if(head != null && head.getData() == data){
            head = head.getLink();
            manyItems--;
            return data;
        }else{
            IntNode curr =  head;
            while(curr.getLink() != null && curr.getLink().getData() != data){
                curr = curr.getLink();
            }
            if(curr.getLink()!=null){
            curr.setLink(curr.getLink().getLink());
            manyItems --;
            return data;
            }
            return null;
        }
    }

    public Integer removeFront(){
        if(head ==null){
            return null;
        }else{
            Integer temp = head.getData();
            head = head.getLink();
            manyItems--;
            return temp;
        }
    }

    public int size() {
        return manyItems;
    }

    public String toString(){
        String result = "{";
        IntNode curr = head;

     while(curr!=null){
        result += curr.getData() + ", ";
        curr = curr.getLink();
     }
     if(!isEmpty()){
        result = result.substring(0, result.length()-2);
     }
     result += "}";   
     return result;
    }

    public Integer get(int index){
        if(index < 0)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        if(head == null)
            throw new IllegalStateException("List is empty.");
        else if(index > size()-1)
            throw new IndexOutOfBoundsException("Index: " + index + " is out of bounds.");
        else{
            IntNode curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.getLink();
            }
            return curr.getData();
        }
    }
    
}