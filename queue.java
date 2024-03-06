public class queue {
    static class queueB{
        static int arr[];
        static int size;
        static int rear;
        queueB(int n){
            arr = new int[n];
            size = n;
            rear = -1;
        }
        public static boolean isEmpty(){
            return rear == -1;
        }
        public static void add(int data){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
            }
            rear = rear + 1;
            arr[rear] = data;
        }
        public static int remove(){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
            }
            int front = arr[0];
            for( int i=0 ; i<rear ; i++){
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front ;
        }
        public static int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
            }
            return arr[0];
        }
    }
        public static void main(String args[]){
            queueB q = new queueB(5);
            q.add(1);
            q.add(7);
            q.add(10);
            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    
}
