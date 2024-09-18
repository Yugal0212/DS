import java.util.Scanner;

class queue {
    int n;
    int r = -1;
    int f = -1;
    int y;
    int Q[];

    queue(int n) {
        this.n = n;
        Q = new int[n];
    }

    void cqinsert(int y) {
        if (r == n - 1) {
            r = 0;
        } else {
            r++;
        }

        if (f == r) {
            System.out.println("queue overflow");
        } else {
            Q[r] = y;
            if (f == -1) {
                f = 0;
            }
        }
    }

    int cqdelete() {
        if (f == -1) {
            System.out.println("queue undeflow");
            return 0;
        } else {
            y = Q[f];

            if (f == r) {
                r = -1;
                f = r;
                return y;
            }

            if (f == n - 1) {
                f = 0;
            } else {
                f++;
            }
        }
        return y;
    }

    void display() {
        if (f <= r) {
            for (int i = f; i <= r; i++) {
                System.out.println(Q[i]);
            }
        } else {
            for (int i = f; i < n; i++) {
                System.out.println(Q[i]);
            }
            for (int i = 0; i <= r; i++) {
                System.out.println(Q[i]);
            }
        }
    }
}

class Lab9_51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your queue size:");
        int n = sc.nextInt();
        queue Q = new queue(n);
        int a = 0;
        int b;
        int i;

        while (a != 4) {
            System.out.println("1=>Enqueue");
            System.out.println("2=>Dequeue");
            System.out.println("3=>Display");
            System.out.println("4=>Exit");
            a = sc.nextInt();

            if (a == 1) {
                System.out.println("Enter your Enqueue no:");
                i = sc.nextInt();
                Q.cqinsert(i);
            } else if (a == 2) {
                b = Q.cqdelete();
                System.out.println("Dequeue number is :" + b);
            } else if (a == 3) {
                Q.display();
            } else {
                System.out.println("--Enter valid number--");
            }
        }
    }
}