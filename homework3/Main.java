public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(1000);
        System.out.println("Creating Stack");
        try {
            stack.push(15);
            stack.push(25);
            stack.push(35);
            stack.push(45);
            stack.push(55);
            System.out.println("Pushed  to the stack:\n15\n25\n35\n45\n55");
            System.out.println("Top item: " + stack.peek()); // 55
            System.out.println("Removing: " + stack.pop()); // 55
            System.out.println("Removing: " + stack.pop()); // 45
            System.out.println("New Top:  " + stack.peek()); // 35
            System.out.println("Is Empty?: " + stack.isEmpty()); // false

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println();
        System.out.println("Creating new queue");
        Queue queue = new Queue(100);
        try {
            queue.enqueue(15);
            queue.enqueue(25);
            queue.enqueue(35);
            queue.enqueue(45);
            queue.enqueue(55);
            System.out.println("Enqueued to the queue:\n15\n25\n35\n45\n55");
            System.out.println("Front item: " + queue.peek());
            System.out.println("Dequeueing: " + queue.dequeue());
            System.out.println("Dequeueing: " + queue.dequeue());
            System.out.println("New front: " + queue.peek());
            System.out.println("Is queue empty?: " + queue.isEmpty());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}

// ----------------------------------------------------------------------------------------------------
// Stack
// ----------------------------------------------------------------------------------------------------
class Stack {
    private int[] stack;
    private int stackSize;

    public Stack(int size) {
        this.stack = new int[size];
        this.stackSize = 0;
    }

    public void push(int value) throws Exception {
        if (this.stackSize >= stack.length) throw new Exception("Stack full, cannot add");
        this.stack[this.stackSize] = value;
        this.stackSize++;
    }

    public int pop() throws Exception {
        if (this.isEmpty()) throw new Exception("Empty Stack, nothing to pop");
        int top = this.stack[stackSize - 1];
        this.stackSize--;
        return top;
    }

    public int peek() throws Exception {
        if (this.isEmpty()) throw new Exception("Empty Stack, nothing to peek");
        return this.stack[stackSize-1];
    }

    public boolean isEmpty() {
        return this.stackSize == 0;
    }

    public int size() {
        return this.stackSize;
    }
}

// ----------------------------------------------------------------------------------------------------
// Queue
// ----------------------------------------------------------------------------------------------------
class Queue {
    private int[] queue;
    private int queueSize;


    public Queue(int size) {
        this.queue = new int[size];
        this.queueSize = 0;
    }

    public void enqueue(int value) throws Exception {
        if (this.queueSize >= queue.length) throw new Exception("Full queue, cannot add");
        this.queue[queueSize] = value;
        this.queueSize++;
    }

    public int dequeue() throws Exception {
        if (this.isEmpty()) throw new Exception("Empty queue, nothing to dequeue");
        int front = this.queue[0];
        for (int i = 0; i < this.queueSize - 1; i++) {
            this.queue[i] = this.queue[i + 1];
        }
        this.queueSize--;
        return front;
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Empty queue, nothing to peek");
        return this.queue[0];
    }

    public boolean isEmpty() {
        return this.queueSize == 0;
    }

    public int size() {
        return this.queueSize;
    }

}