package pekan8_2511533014;

public class ShellSort_2511533014 {
	
	public static void shellSort_3014(int[] A_3014) {
		int n_3014 = A_3014.length;
		int gap_3014 = n_3014/2;
		while (gap_3014 > 0) {
			for (int i_3014 = gap_3014; i_3014 < n_3014; i_3014++) {
				int temp_3014 = A_3014[i_3014];
				int j_3014 = i_3014;
				while (j_3014 >= gap_3014 && A_3014 [j_3014 - gap_3014] > temp_3014) {
					A_3014 [j_3014] = A_3014[j_3014 - gap_3014];
					j_3014 = j_3014 - gap_3014;
				}
				A_3014 [j_3014] = temp_3014;
			}
			gap_3014 = gap_3014 / 2;
		}
	}
	public static void main (String[] args) {
		int[] data_3014 = {3, 10, 4, 6, 8, 9, 7, 2, 1, 5};
		
		System.out.print("Sebelum: ");
		printArray(data_3014);
		
		shellSort_3014(data_3014);
		
		System.out.print("Sesudah (Shell Sort): ");
		printArray(data_3014);
	}
	
	public static void printArray(int[] arr) {
		for (int i_3014 : arr) System.out.print(i_3014 + " ");
		System.out.println();
	}

}
