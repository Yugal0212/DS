//52. Write a menu driven program to implement following operations on the 
// Doubled Ended Queue using an Array 
//  Insert at front end, Insert at rear end 
//  Delete from front end, Delete from rear end 
//  Display all elements of the queue
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

    void Enqueue_At_rear(int data) {
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

    void Enqueue_At_font(int data) {
        if (front == 0)
            System.out.println("Queue Overflow");

        if (front == -1) {
            front = 0;
            rear = 0;

        } else {
            front--;
        }

        q[front] = data;

    }

    int Dequeue_AT_font() {
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

    int Dequeue_AT_rear() {
        int data = 0;
        if (rear == -1) {
            System.out.println("Queue Underflow");
            return 0;
        }
        data = q[rear];
        if (front == rear) {
            front = rear = -1;
        } else {
            rear--;
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

public class Lab9_52 {
    public static void main(String[] args) {
        Queue1 q = new Queue1(5);
        q.Enqueue_At_font(10);
        q.Enqueue_At_rear(20);
        q.Enqueue_At_rear(30);
        q.Enqueue_At_rear(40);
        q.Enqueue_At_rear(50);
        System.out.println("Dequeued from queue: " + q.Dequeue_AT_rear());
        q.display();
    }
}
