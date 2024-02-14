import java.util.*;
import java.util.LinkedList;
public class Queue13 {
    public static class Queue{
        Deque<Integer> deque = new LinkedList<>();
        public  void push(int data){
            deque.addLast(data);
        }
        public  int pop(){
            return deque.removeFirst();
        }
        public  int peek(){
           return  deque.getFirst();
        }
        public boolean isEmpty(){
            return deque.isEmpty();
        }
        
    }
    public static void main(String args[]){
           Queue q = new Queue();
           q.push(1);
           q.push(2);
           q.push(3);
           q.push(4);
           q.push(5);
           q.push(6);
           while(!q.isEmpty()){
            System.out.println(q.peek());
            q.pop();
           }
        }
}
