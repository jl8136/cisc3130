import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("Creating Stack");
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        System.out.println("Pushed  to the stack:\n15\n25\n35\n45\n55");
        try {
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
        System.out.println("Adding to the queue:\n15\n25\n35\n45\n55");
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);
        queue.enqueue(55);
        try {
            System.out.println("Front item: " + queue.peek());
            System.out.println("Removing: " + queue.dequeue());
            System.out.println("Removing: " + queue.dequeue());
            System.out.println("New front: " + queue.peek());
            System.out.println("Is queue emtpy?: " + queue.isEmpty());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


    }
}

// ----------------------------------------------------------------------------------------------------
// Stack
// ----------------------------------------------------------------------------------------------------
class Stack {
    private final ArrayList<Integer> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }
    public void push(int value) {
        stack.add(value);
    }

    public int pop() throws Exception {
       if (this.isEmpty()) {
           throw new Exception("Stack is empty");
       }
        return stack.remove(stack.size() - 1);
    }

    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
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

    public void enqueue(int value) {
        if (this.queueSize >= queue.length) return;
        this.queue[queueSize] = value;
        this.queueSize++;
    }

    public int dequeue() throws Exception {
        if (isEmpty()) throw new Exception("Empty queue");
        int front = this.queue[0];
        for (int i = 0; i < this.queueSize - 1; i++) {
            this.queue[i] = this.queue[i + 1];
        }
        queueSize--;
        return front;
    }

    public int peek() throws Exception {
        if (isEmpty()) throw new Exception("Empty queue");
        return this.queue[0];
    }

    public boolean isEmpty() {
        return this.queueSize == 0;
    }

    public int size() {
        return this.queueSize;
    }

}