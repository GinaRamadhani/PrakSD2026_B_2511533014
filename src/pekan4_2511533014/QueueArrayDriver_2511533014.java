package pekan4_2511533014;

public class QueueArrayDriver_2511533014 {
	    public static void main(String[] args) {
	        QueueArray_2511533014 queue = new QueueArray_2511533014(1000);
	        queue.enqueue_3014(10);
	        queue.enqueue_3014(20);
	        queue.enqueue_3014(30);
	        queue.enqueue_3014(40);

	        System.out.println("Item di depan " + queue.front_3014());
	        System.out.println("Item paling belakang " + queue.rear_3014());
	        System.out.println("Tampilan queue");
	        queue.display_3014();
	        System.out.println();

	        System.out.println(queue.dequeue_3014() + " dihapus dari queue");
	        System.out.println("item di depan: " + queue.front_3014());
	        System.out.println("item dibelakang: " + queue.rear_3014());
	        System.out.println("tampilan queue setelah satu data dihapus");
	        queue.display_3014();
	    }
	}

	

