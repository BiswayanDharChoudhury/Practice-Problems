import java.util.*;

public class queue5 {
    static class MyQueue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();
        
        public void add(int data) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }
        
        public int remove() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1; // You can return a special value to indicate an error.
            }
            return s1.pop();
        }
        
        public int peek() {
            if (s1.isEmpty()) {
                System.out.println("Queue is Empty");
                return -1; // You can return a special value to indicate an error.
            }
            return s1.peek();
        }
        
        public boolean isEmpty() {
            return s1.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.add(5);
        q.add(7);
        q.add(9);
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
