package pekan8_2511533014;

public class QuickSort_2511533014 {
	    static void swap_3014(int[] arr_3014, int i_3014, int j_3014)
	    {
	        int temp_3014 = arr_3014[i_3014];
	        arr_3014[i_3014] = arr_3014[j_3014];
	        arr_3014[j_3014] = temp_3014;
	    }

	    // Metode tambahan untuk mengatur pivot menggunakan Median-of-Three
	    static void medianOfThree_3014(int[] arr_3014, int low_3014, int high_3014)
	    {
	        int mid_3014 = low_3014 + (high_3014 - low_3014) / 2;
	        // Urutkan elemen low, mid, dan high
	        if (arr_3014[low_3014] > arr_3014[mid_3014]) {
	            swap_3014(arr_3014, low_3014, mid_3014);
	        }
	        if (arr_3014[low_3014] > arr_3014[high_3014]) {
	            swap_3014(arr_3014, low_3014, high_3014);
	        }
	        if (arr_3014[mid_3014] > arr_3014[high_3014]) {
	            swap_3014(arr_3014, mid_3014, high_3014);
	        }
	        swap_3014(arr_3014, mid_3014, high_3014);
	    }

	    static int partition_3014(int[] arr_3014, int low_3014, int high_3014)
	    {
	        // Panggil fungsi medianOfThree sebelum menentukan pivot
	        medianOfThree_3014(arr_3014, low_3014, high_3014);
	        int pivot_3014 = arr_3014[high_3014]; // Sekarang arr[high] sudah berisi nilai median
	        int i_3014 = (low_3014 - 1);
	        for (int j_3014 = low_3014; j_3014 <= high_3014 - 1; j_3014++) {
	            // Jika elemen saat ini lebih kecil dari atau sama dengan pivot
	            if (arr_3014[j_3014] < pivot_3014) {
	                // Increment indeks elemen yang lebih kecil
	                i_3014++;
	                swap_3014(arr_3014, i_3014, j_3014);
	            }
	        }
	        swap_3014(arr_3014, i_3014 + 1, high_3014);
	        return (i_3014 + 1);
	    }

static void quickSort_3014(int[] arr_3014, int low_3014, int high_3014)
{
    if (low_3014 < high_3014) {
        int pi_3014 = partition_3014(arr_3014, low_3014, high_3014);
        quickSort_3014(arr_3014, low_3014, pi_3014 - 1);
        quickSort_3014(arr_3014, pi_3014 + 1, high_3014);
    }
}

public static void printArr_3014(int[] arr_3014)
{
    for (int i_3014 = 0; i_3014 < arr_3014.length; i_3014++) {
        System.out.print(arr_3014[i_3014] + " ");
    }
    System.out.println();
}

public static void main(String[] args)
{
    int[] arr_3014 = {10, 7, 8, 9, 1, 5};
    int N_3014 = arr_3014.length;

    System.out.print("Data sebelum diurutkan: ");
    printArr_3014(arr_3014);

    quickSort_3014(arr_3014, 0, N_3014 - 1);

    System.out.print("Data Terurut quicksort: ");
    printArr_3014(arr_3014);
    }
}
