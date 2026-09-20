import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(15);
        stack.push(25);
        stack.push(35);
        stack.push(45);
        stack.push(55);
        System.out.println("Pushed 15, 25, 35, 45, 55 to the stack");
        try {
            System.out.println("Top item: " + stack.peek()); // 55
            System.out.println("Removing: " + stack.pop()); // 55
            System.out.println("Removing: " + stack.pop()); // 45
            System.out.println("New Top:  " + stack.peek()); // 35
            System.out.println("Is Empty?: " + stack.isEmpty()); // false



        }
        catch(Exception e) {
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