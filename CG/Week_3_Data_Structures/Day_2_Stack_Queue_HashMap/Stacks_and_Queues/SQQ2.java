import java.util.Stack;

class SortStackUsingRecursion {
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sortStack(stack);
            insertInSortedOrder(stack, temp);
        }
    }
    private static void insertInSortedOrder(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || value > stack.peek()) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insertInSortedOrder(stack, value);
        stack.push(temp);
    }
    public static void printStack(Stack<Integer> stack) {
        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        System.out.println("Original Stack:");
        printStack(stack);
        sortStack(stack);
        System.out.println("\nSorted Stack:");
        printStack(stack);
    }
}