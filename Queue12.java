import java.util.*;

public class Queue12 {
    public static class MyStack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }

        public boolean isEmpty() {
            return deque.isEmpty();
        }
    }

    public static void main(String args[]) {
        MyStack s = new MyStack();
        s.push(1);
        s.push(2);
        s.push(3);
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
