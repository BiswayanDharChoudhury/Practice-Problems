import java.util.*;

public class StackB2 {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
        } else {
            int top = s.pop();
            pushAtBottom(s, data);
            s.push(top);
        }
    }

    public static void main(String args[]) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        // Push '4' at the bottom
        pushAtBottom(s, 4);
        
        // Pop elements to see '4' at the bottom
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
