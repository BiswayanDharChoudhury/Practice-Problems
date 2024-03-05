import java.util.*;

public class queue2 {
    static class queueA {
        static int arr[];
        static int size;
        static int r;
        static int f;

        queueA(int n) {
            arr = new int[n];
            size = n;
            r = -1;
            f = -1;
        }

        void enqueue(int data) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter data:");
            int i = sc.nextInt();
            if ((f == 0 && r == size - 1) || (r == (f - 1) % (size - 1))) {
                System.out.print("Overflow");
            } else if (f == -1 && r == -1) {
                f = 0;
                r = 0;
                arr[r] = i;
            } else {
                r = (r + 1) % size;
                arr[r] = i;
            }
        }

        void dequeue(int data) {
            if (f == -1 && r == -1) {
                System.out.println("Underflow");
            } else if (f == r) {
                System.out.println("Underflow");
                f = -1;
                r = -1;
            } else {
                f = (f + 1) % size;
            }
        }

        public static boolean isEmpty() {
            return f == -1;
        }

        public static void add(int data) {
            if (isEmpty()) {
                System.out.println("The Queue is Empty");
            }
            r = (r + 1) % size;
            arr[r] = data;
        }

        public static int remove() {
            if (isEmpty()) {
                System.out.println("The Queue is Empty");
            }
            int front = arr[f];
            if (f == r) {
                f = -1;
                r = -1;
            } else {
                f = (f + 1) % size;
            }
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
            }
            return arr[f];
        }

        public void display() {
            int i;
            if (f == -1 && r == -1) {
              System.out.println("Queue is Empty");
            } else {
              for (i = f; ; i = (i + 1) % size) {
                System.out.println(arr[i]);
                if (i == r) {
                  break;
                }
              }
            }
          }
          
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        queueA q = new queueA(10);
        q.add(2);
        q.add(5);
        q.add(8);
        q.add(10);
        q.add(56);
        q.add(45);
        q.add(12);
        q.add(18);
        q.add(19);
        q.add(20);
        q.display();
        q.dequeue(5);
        q.display();
    }
}

