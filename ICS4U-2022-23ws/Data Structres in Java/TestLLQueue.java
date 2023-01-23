public class TestLLQueue {
    public static void main(String[] args) {
        int testPassed = 0;
        int testFailed = 0;

        if (!testLLQueue()) {
            System.out.println("Tests Failed: testLLQueue()");
            testFailed++;
        } else {
            testPassed++;
        }
        if (!testArrayQueue()) {
            System.out.println("Tests Failed: testArrayQueue()");
            testFailed++;
        } else {
            testPassed++;
        }

        System.out.println("Tests Passed: " + testPassed);
        System.out.println("Tests Failed: " + testFailed); 
    }

    private static IntArrayQueue prepareArrayQueue(){
        IntArrayQueue queue = new IntArrayQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        return queue;

    }

    private static boolean testArrayQueue() {
        IntArrayQueue queue = prepareArrayQueue();
        if(queue.get(0)!=1)
            return false;
        if(queue.get(4)!=5)
            return false;
        if(queue.get(2)!=3)
            return false;
        
        queue.dequeue();
        if(queue.get(0)!=2)
            return false;
        queue.dequeue();
        if(queue.get(0)!=3)
            return false;
        
        if(queue.peak()!=3)
            return false;
        
        queue.clear();
        if(!queue.isEmpty())
            return false;

        return true;
    }

    private static IntLLQueue prepareLLQueue(){
        IntLLQueue queue = new IntLLQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        return queue;
    }

    private static boolean testLLQueue() {
        IntLLQueue queue = prepareLLQueue();
        if(queue.get(0)!=1)
            return false;
        if(queue.get(4)!=5)
            return false;
        if(queue.get(2)!=3)
            return false;
        
        queue.dequeue();
        if(queue.get(0)!=2)
            return false;
        queue.dequeue();
        if(queue.get(0)!=3)
            return false;
        
        if(queue.peak()!=3)
            return false;
        
        queue.clear();
        if(!queue.isEmpty())
            return false;

        return true;
    }
}