import java.util.*;

public class queue3 {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node f = null;
    Node r = null;

    public void enqueue(int data) {
        Node new_Node = new Node(data);
        if (f == null) {
            f = new_Node;
            r = new_Node;
        } else {
            r.next = new_Node;
            r = new_Node;
        }
    }

    public void dequeue() {
        if (f == null) {
            System.out.println("Underflow");
        } else {
            f = f.next;
        }
    }

    public void display() {
        Node temp = f;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        queue3 q = new queue3();

        do {
            System.out.println("Queue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to enqueue: ");
                    int dataToEnqueue = sc.nextInt();
                    q.enqueue(dataToEnqueue);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    System.out.print("Queue elements: ");
                    q.display();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

