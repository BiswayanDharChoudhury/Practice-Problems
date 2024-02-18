import java.util.*;
public class Queue10 {
    public class Queue{
        public static void reverse(Queue<Integer> q){
           Stack<Integer> s = new Stack<>();
           while(!q.isEmpty()){
            s.add(q.remove());
           }
           while(!s.isEmpty()){
            q.add(s.remove());
           }
        }
        public static void main(String args[]){
            Queue<Integer> q = new Queue<>();
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            q.add(6);
            reverse(q);
            while(!q.isEmpty()){
                System.out.println(q.remove());
            }
        }
    }
}
