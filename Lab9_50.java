//50. Write a menu driven program to implement following operations on the Queue 
// using an Array 
//  ENQUEUE 
//  DEQUEUE 
//  DISPLAY 
class Queue1 {
    int front = -1, rear = -1;
    int q[];

    Queue1(int size) {
        q = new int[size];
    }

    void Enqueue(int data) {
        if (rear == q.length - 1)
            System.out.println("Queue Overflow");
        else {
            if (front == -1) {
                front = 0;
            }
            rear = rear + 1;
            q[rear] = data;
        }
    }

    int Dequeue() {
        int data = 0;
        if (front == -1 || front > rear) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            data = q[front];
            front = front + 1;
            if (front == rear)
                front = rear = -1;
        }
        return data;
    }

    void display() {
        if (front == -1)
            System.out.println("Queue is empty");
        else {
            System.out.print("Queue elements are: ");
            for (int i = front; i <= rear; i++)
                System.out.print(q[i] + " ");
            System.out.println();
        }
    }
}

public class Lab9_50 {
    public static void main(String[] args) {
        Queue1 q = new Queue1(5);
        q.Enqueue(10);
        q.Enqueue(20);
        q.Enqueue(30);
        q.Enqueue(40);
        q.Enqueue(50);
        System.out.println("Dequeued from queue: " + q.Dequeue());
        q.display();
    }
}