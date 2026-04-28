package pekan4_2511533014;

public class QueueArray_2511533014 {
	int front_3014, rear_3014, size_3014;
	int capacity_3014;
	int array_3014[];
	
	public QueueArray_2511533014(int capacity) {
		this.capacity_3014 = capacity;
		front_3014 = this.size_3014 = 0;
		rear_3014 = capacity - 1;
		array_3014 = new int [this.capacity_3014];
		
	}
	boolean isFull_3014 (QueueArray_2511533014 queue) {
		return (queue.size_3014 == queue.capacity_3014);
	}
	boolean isEmpty_3014 (QueueArray_2511533014 queue) {
		return (queue.size_3014 == 0);
	}
	void enqueue_3014 (int item) {
		if (isFull_3014(this))
			return;
		this.rear_3014 = (this.rear_3014 + 1) % this.capacity_3014;
		this.array_3014 [this.rear_3014] = item;
		this.size_3014 = this.size_3014 + 1;
		System.out.println(item + " enqueued to queue");
		
	}
	int dequeue_3014() {
		if (isEmpty_3014(this))
			return Integer.MIN_VALUE;
		int item = this.array_3014[this.front_3014];
		this.front_3014 = (this.front_3014 + 1) % this.capacity_3014;
	    this.size_3014 = this.size_3014 - 1;
	    return item;
	}

	int front_3014() {
	    if (isEmpty_3014(this))
	        return Integer.MIN_VALUE;
	    return this.array_3014[this.front_3014];
	}

	int rear_3014() {
	    if (isEmpty_3014(this))
	        return Integer.MIN_VALUE;
	    return this.array_3014[this.rear_3014];
	}

	// mencetak elemen antrian
	void display_3014() {
	    int i;
	    if (front_3014 == rear_3014) {
	        System.out.println("\nAntrian Kosong\n");
	        return;
	    }

	    // kunjungi dari belakang dan cetak
	    for (i = front_3014; i < rear_3014; i++)
	        System.out.printf(" %d <-- ", array_3014[i]);
	    return;
	
				
	}

	
	}