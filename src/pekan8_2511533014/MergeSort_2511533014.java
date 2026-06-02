package pekan8_2511533014;

public class MergeSort_2511533014 {
	    void merge_3014(int arr_3014[], int l_3014, int m_3014, int r_3014)
	    {
	        // Find sizes of two subarrays to be merged
	        int n1_3014 = m_3014 - l_3014 + 1; 
	        int n2_3014 = r_3014 - m_3014;
	        /* Create temp arrays */
	        int L_3014[] = new int[n1_3014];
	        int R_3014[] = new int[n2_3014];
	        /* Copy data to temp arrays */
	        for (int i_3014 = 0; i_3014 < n1_3014; ++i_3014)
	            L_3014[i_3014] = arr_3014[l_3014 + i_3014];
	        for (int j_3014 = 0; j_3014 < n2_3014; ++j_3014)
	            R_3014[j_3014] = arr_3014[m_3014 + 1 + j_3014];
	        int i_3014 = 0, j_3014 = 0;
	        // Initial index of merged subarray array
	        int k_3014 = l_3014;
	        while (i_3014 < n1_3014 && j_3014 < n2_3014) {
	            if (L_3014[i_3014] <= R_3014[j_3014]) {
	                arr_3014[k_3014] = L_3014[i_3014];
	                i_3014++;
	            } else {
	                arr_3014[k_3014] = R_3014[j_3014];
	                j_3014++;
	            }
	            k_3014++;
	        }

	        /* Copy remaining elements of L[] if any */
	        while (i_3014 < n1_3014) {
	            arr_3014[k_3014] = L_3014[i_3014];
	            i_3014++;
	            k_3014++;
	        }

	        /* Copy remaining elements of R[] if any */
	        while (j_3014 < n2_3014) {
	            arr_3014[k_3014] = R_3014[j_3014];
	            j_3014++;
	            k_3014++;
	        }
	    }
	    void sort_3014(int arr_3014[], int l_3014, int r_3014) {
	        if (l_3014 < r_3014) {
	            // Find the middle point
	            int m_3014 = (l_3014 + r_3014) / 2;
	            // Sort first and second halves
	            sort_3014(arr_3014, l_3014, m_3014);
	            sort_3014(arr_3014, m_3014 + 1, r_3014);
	            // Merge the sorted halves
	            merge_3014(arr_3014, l_3014, m_3014, r_3014);
	        }
	    }

	    /* A utility function to print array of size n */
	    static void printArray_3014(int arr_3014[]) {
	        int n_3014 = arr_3014.length;
	        for (int i_3014 = 0; i_3014 < n_3014; ++i_3014)
	            System.out.print(arr_3014[i_3014] + " ");
	        System.out.println();
	    }

	    public static void main(String args[]) {
	        int arr_3014[] = {12, 11, 13, 5, 6, 7};
	        System.out.println("Sebelum terurut");
	        printArray_3014(arr_3014);
	        MergeSort_2511533014 ob_3014 = new MergeSort_2511533014();
	        ob_3014.sort_3014(arr_3014, 0, arr_3014.length - 1);
	        System.out.println("\nSesudah Terurut menggunakan merge Sort");
	        printArray_3014(arr_3014);
	    }
	}


