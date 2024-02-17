import java.util.*;
public class Queue11 {
    public static void main(String args[]){
        Deque<Integer> Deque = new LinkedList<>();
        Deque.addFirst(1);
        Deque.addLast(2);
        Deque.addFirst(3);
        System.out.println(Deque);
        Deque.removeLast();
        System.out.println(Deque);
        Deque.removeFirst();
        Deque.removeLast();
        System.out.println(Deque);
        Deque.addFirst(33);
        Deque.addFirst(45+54);
        Deque.addLast(45-23);
        Deque.addFirst(65+9);
        System.out.println(Deque);
        Deque.removeLast();
        Deque.removeFirst();
        System.out.println(Deque);
    }
}
