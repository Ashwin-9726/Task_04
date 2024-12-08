
import java.util.Stack;

public class IntegerStackCollection {
        private Stack<Integer> stack; // Stack to store integers

        // Constructor to initialize the stack
        public IntegerStackCollection() {
            stack = new Stack<>();
        }

        /**
         * Pushes an element onto the stack.
         *
         * @param value Integer value to push onto the stack.
         */
        public void push(int value) {
            stack.push(value);
            System.out.println("Pushed " + value + " onto the stack.");
        }

        /**
         * Pops the top element from the stack.
         */
        public void pop() {
            if (!stack.isEmpty()) {
                int value = stack.pop();
                System.out.println("Popped " + value + " from the stack.");
            } else {
                System.out.println("Stack is empty. Nothing to pop.");
            }
        }

        /**
         * Checks if the stack is empty.
         */
        public void checkEmpty() {
            if (stack.isEmpty()) {
                System.out.println("The stack is empty.");
            } else {
                System.out.println("The stack is not empty.");
            }
        }

        /**
         * Displays the current state of the stack.
         */
        public void displayStack() {
            System.out.println("Current stack: " + stack);
        }

        public static void main(String[] args) {
            IntegerStackCollection manager = new IntegerStackCollection();

            //  operations on the stack
            manager.push(10);
            manager.push(20);
            manager.push(30);

            manager.displayStack();

            manager.checkEmpty();

            manager.pop();
            manager.displayStack();

            manager.pop();
            manager.pop();

            manager.checkEmpty();
            manager.displayStack();

            manager.pop(); // Try popping when stack is empty
        }
    }