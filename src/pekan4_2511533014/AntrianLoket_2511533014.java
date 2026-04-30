package pekan4_2511533014;
import java.util.Stack;
public class AntrianLoket_2511533014 {
    String queue_3014[];
    int front_3014;
    int rear_3014;
    int max_3014;

    // Constructor
    public AntrianLoket_2511533014(int max) {
        this.max_3014 = max;
        queue_3014 = new String[max];
        front_3014 = 0;
        rear_3014 = -1;
    }

    // Cek kosong
    boolean isEmpty_3014() {
        return (rear_3014 < front_3014);
    }

    // Cek penuh
    boolean isFull_3014() {
        return (rear_3014 == max_3014 - 1);
    }

    // Enqueue
    void enqueue_3014(String data) {
        if (isFull_3014()) {
            System.out.println("Antrian penuh!");
        } else {
            rear_3014++;
            queue_3014[rear_3014] = data;
            System.out.println("Data berhasil ditambahkan ke antrian");
        }
    }

    // Dequeue
    void dequeue_3014() {
        if (isEmpty_3014()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(queue_3014[front_3014] + " telah dilayani");
            front_3014++;
        }
    }

    // Display
    void display_3014() {
        if (isEmpty_3014()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Isi antrian:");
            int no = 1;
            for (int i = front_3014; i <= rear_3014; i++) {
                System.out.println(no + ". " + queue_3014[i]);
                no++;
            }
        }
    }

    // Reverse
    void reverse_3014() {
        if (isEmpty_3014()) {
            System.out.println("Antrian kosong!");
            return;
        }

        Stack<String> stack = new Stack<>();

        // Queue → Stack
        for (int i = front_3014; i <= rear_3014; i++) {
            stack.push(queue_3014[i]);
        }

        // Stack → Queue
        int i = front_3014;
        while (!stack.isEmpty()) {
            queue_3014[i] = stack.pop();
            i++;
        }

        System.out.println("Antrian berhasil dibalik");
    }
}